package ru.deyev.sbb.repository;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

public class BasicRepository<T> {

    protected Class<T> entityClass;

    @PersistenceContext(unitName = "sbb_pu")
    protected EntityManager entityManager;

    protected BasicRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T entity) {
        entityManager.persist(entity);
    }

    public T findById(UUID id) throws EntityNotFoundException {
        T entity = entityManager.find(entityClass, id);
        if (entity != null) {
            return entity;
        }
        throw new EntityNotFoundException(entityClass.getSimpleName()
                + " with id " + id.toString() + " not found.");
    }

    public List<T> findAll(){
//        List<T> resultList = entityManager.createQuery("select t from "
//                + entityClass.getCanonicalName()+ " t").getResultList();
//        if (resultList == null || resultList.isEmpty()){
//            throw new EntityNotFoundException("There aren't any " + entityClass.getSimpleName()
//                    + "s in system");
//        }
//        return resultList;
        //------------
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<T> cq = cb.createQuery(entityClass);
//        Root<T> rootEntry = cq.from(entityClass);
//        CriteriaQuery<T> all = cq.select(rootEntry);
//        TypedQuery<T> allQuery = entityManager.createQuery(all);
//        return allQuery.getResultList();
        //-------------
        return entityManager.createQuery("Select t from " +
                entityClass.getSimpleName() + " t")
                .getResultList();
    }

    public void update(T entity){
        entityManager.merge(entity);
    }

    public void delete(UUID id){
        entityManager.remove(findById(id));
    }

    public void detach(T entity) {
        entityManager.detach(entity);
    }

    public void refresh(T entity) {
        entityManager.refresh(entity);
    }


}
