package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.dao;

import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.Booking;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.User;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by hasib on 16-Mar-16.
 */
public class BookingDao extends AbstractDAO<Booking> {
    public BookingDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public List<Booking> findAll() {
        return list(namedQuery("Booking.findAll"));
    }
}
