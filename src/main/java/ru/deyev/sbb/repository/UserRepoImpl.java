package ru.deyev.sbb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.deyev.sbb.entity.User;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo{

    @Autowired
    protected EntityManager entityManager;

//    @PersistenceUnit(unitName = "sbb_pu")
//    private EntityManagerFactory emf;
    //EntityManagerFactory emf = Persistence.createEntityManagerFactory("sbb_pu");

    public List<User> findAll(){
    //entityManager = emf.createEntityManager();
        return entityManager.createQuery("select t from " +
                User.class.getSimpleName() + " t")
                .getResultList();
    }
    //todo implement all methods

}
