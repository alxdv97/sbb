package ru.deyev.sbb.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

public abstract class BasicRepository<T> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Class<T> entityClass;

    protected BasicRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }


    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public void create(T entity) {
        getSession().persist(entity);
    }

    public T findById(UUID id) throws EntityNotFoundException {
        T entity = getSession().find(entityClass, id);
        if (entity != null) {
            return entity;
        }
        throw new EntityNotFoundException(entityClass.getSimpleName()
                + " with id " + id.toString() + " not found.");
    }

    public List<T> findAll() {
        return getSession().createQuery("Select t from " +
                entityClass.getSimpleName() + " t")
                .getResultList();
    }

    public void update(T entity) {
        getSession().merge(entity);
    }

    public void delete(UUID id) {
        getSession().remove(findById(id));
    }

    public void detach(T entity) {
        getSession().detach(entity);
    }

    public void refresh(T entity) {
        getSession().refresh(entity);
    }


}
