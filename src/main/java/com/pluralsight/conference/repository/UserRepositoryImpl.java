package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class UserRepositoryImpl implements UserRepository {

//    private final EntityManager entityManager; // Make it final
//
//    @Autowired // Add this annotation
//    public UserRepositoryImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(User user){

        entityManager.persist(user);
        return user;
    }
}
