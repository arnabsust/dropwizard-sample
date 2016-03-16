package com.southtech.g2c.mservice.thromdoe.rest.spacebooking.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by hasib on 16-Mar-16.
 */
@Entity
@Table(name = "roles")
@NamedQueries({
        @NamedQuery(name = "Role.findAll", query = "select r from Role r")
})
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="roleid")
    private int RoleID;

    @Column(name="rolename")
    private String RoleName;

    @OneToMany(targetEntity = UserRole.class, mappedBy = "role")
    private List<UserRole> userRoles;

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
