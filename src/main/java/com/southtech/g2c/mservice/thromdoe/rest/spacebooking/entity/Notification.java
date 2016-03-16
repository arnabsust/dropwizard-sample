package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity;

import javax.persistence.*;

/**
 * Created by hasib on 16-Mar-16.
 */
@Entity
@Table(name = "notifications")
@NamedQueries({
        @NamedQuery(name = "Notification.findAll", query = "select n from Notification n")
})
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="notificationid")
    private int NotificationID;

    @Column(name="userid")
    private int UserID;

    @Column(name="operation")
    private String Operation;

    @Column(name="notification")
    private String Notification;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User user;

    public int getNotificationID() {
        return NotificationID;
    }

    public void setNotificationID(int notificationID) {
        NotificationID = notificationID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        Operation = operation;
    }

    public String getNotification() {
        return Notification;
    }

    public void setNotification(String notification) {
        Notification = notification;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
