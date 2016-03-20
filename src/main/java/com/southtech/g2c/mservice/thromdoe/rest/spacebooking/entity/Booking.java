package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hasib on 16-Mar-16.
 */
@Entity
@Table(name = "bookings")
@NamedQueries({
        @NamedQuery(name = "Booking.findAll", query = "from Booking b"),
        @NamedQuery(name = "Booking.findByDateLocationUser", query = "from Booking b where b.BookingDate >= :fromDate and b.BookingDate <= :toDate and b.BookingLocation = :location and b.UserID = :userID")
})
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bookingid")
    private int BookingID;

    @Column(name="bookingdate")
    private Date BookingDate;

    @Column(name="bookingname")
    private String BookingName;

    @Column(name="bookinglocation")
    private String BookingLocation;

    @Column(name="bookingreason")
    private String BookingReason;

    @Column(name="contactno")
    private String ContactNo;

    @Column(name="remarks")
    private String Remarks;

    @Column(name="status")
    private int Status;

    @Column(name="startdate")
    private Date StartDate;

    @Column(name="enddate")
    private Date EndDate;

    @Column(name="userid")
    private int UserID;

    @ManyToOne
    @JoinColumn(name="UserID")
    private User user;

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public Date getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        BookingDate = bookingDate;
    }

    public String getBookingName() {
        return BookingName;
    }

    public void setBookingName(String bookingName) {
        BookingName = bookingName;
    }

    public String getBookingLocation() {
        return BookingLocation;
    }

    public void setBookingLocation(String bookingLocation) {
        BookingLocation = bookingLocation;
    }

    public String getBookingReason() {
        return BookingReason;
    }

    public void setBookingReason(String bookingReason) {
        BookingReason = bookingReason;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
