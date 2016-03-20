package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.resources;

import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.dao.BookingDao;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.Booking;
import com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity.User;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.List;

/**
 * Created by hasib on 16-Mar-16.
 */
@Path("/bookings")
@Produces(MediaType.APPLICATION_JSON)
public class BookingResource {
    private BookingDao bookingDao;

    public BookingResource(BookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }

    @GET
    @UnitOfWork
    public List<Booking> findAll() {
        return bookingDao.findAll();
    }

    @GET
    @UnitOfWork
    @Path("/getbydatelocationuser")
    public List<Booking> findAll(
            @QueryParam("fromDate") String fromDate,
            @QueryParam("toDate") String toDate,
            @QueryParam("location") String location,
            @QueryParam("userID") int userID) {
        return bookingDao.findAll(new Date(fromDate), new Date(toDate), location, userID);
    }
}
