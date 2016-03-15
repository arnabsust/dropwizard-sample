package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.resources;

import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.dao.UserDao;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.User;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hasib on 15-Mar-16.
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    private UserDao userDao;

    public UserResource(UserDao userDao) {
        this.userDao = userDao;
    }

    @GET
    @Path("/{id}")
    @UnitOfWork
    public User findById(@PathParam("id") int id) {
        return userDao.findByUserId(id);
    }
}
