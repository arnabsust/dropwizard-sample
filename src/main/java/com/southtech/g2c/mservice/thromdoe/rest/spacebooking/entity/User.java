package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity;

import javax.persistence.*;

/**
 * Created by hasib on 15-Mar-16.
 */
@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "User.findAll",
        query = "select u from User u"),
        @NamedQuery(name = "User.findById",
                query = "select u from User u "
                        + "where u.UserID = :userId ")
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

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
