package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_role", schema = "smart_cafe")
public class UserRole implements Serializable {
    private static final long serialVersionUID = -1242427046672731445L;

    private int id;
    private String role;
    private User user;

    @Id
    @Column(name = "user_role_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int userRoleId) {
        this.id = userRoleId;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 45)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @ManyToOne
    @JoinColumn(name = "username")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
