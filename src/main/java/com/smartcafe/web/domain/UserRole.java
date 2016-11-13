package com.smartcafe.web.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_role", schema = "smart_cafe")
class UserRole extends AbstractDomain {
    private static final long serialVersionUID = -1242427046672731445L;

    private String role;
    private User user;

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
