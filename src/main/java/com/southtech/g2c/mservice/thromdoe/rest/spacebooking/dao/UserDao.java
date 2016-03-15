package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.dao;

import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.User;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by hasib on 15-Mar-16.
 */
public class UserDao extends AbstractDAO<User> {
    public UserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<User> findAll() {
        return list(namedQuery("User.findAll"));
    }

    public User findByUserId(int userId) {
        return get(userId);
    }
}
