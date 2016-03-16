package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by hasib on 15-Mar-16.
 */
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "User.findAll",
        query = "from User u join u.userRoles"),
        @NamedQuery(name = "User.findById", query = "select u.UserID, u.UserName, u.Email, u.ContactNo, u.Name, u.Address from User u where u.UserID = :userID")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    private int UserID;

    @Column(name="username")
    private String UserName;

    @Column(name="password")
    private String Password;

    @Column(name="email")
    private String Email;

    @Column(name="contactno")
    private String ContactNo;

    @Column(name="name")
    private String Name;

    @Column(name="address")
    private String Address;

    @OneToMany(targetEntity = UserRole.class, mappedBy = "user")
    private List<UserRole> userRoles;

    @OneToMany(targetEntity = Booking.class, mappedBy = "user")
    private List<Booking> bookings;

    @OneToMany(targetEntity = Notification.class, mappedBy = "user")
    private List<Notification> notifications;

    public User() {
    }

    public User(String userName, String password, String email, String contactNo, String name, String address) {
        UserName = userName;
        Password = password;
        Email = email;
        ContactNo = contactNo;
        Name = name;
        Address = address;
    }

    @JsonProperty
    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    @JsonProperty
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @JsonProperty
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @JsonProperty
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @JsonProperty
    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    @JsonProperty
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @JsonProperty
    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}
