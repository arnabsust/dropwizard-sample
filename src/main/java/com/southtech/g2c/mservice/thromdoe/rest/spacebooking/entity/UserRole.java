package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity;

import javax.persistence.*;

/**
 * Created by hasib on 16-Mar-16.
 */
@Entity
@Table(name = "userroles")
@NamedQueries({
        @NamedQuery(name = "UserRole.findAll", query = "select ur from UserRole ur")
})
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int ID;

    @Column(name="roleid")
    private int RoleID;

    @Column(name="userid")
    private int UserID;

    @ManyToOne
    @JoinColumn(name="RoleID")
    private Role role;

    @ManyToOne
    @JoinColumn(name="UserID")
    private User user;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
