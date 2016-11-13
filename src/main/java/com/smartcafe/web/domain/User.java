package com.smartcafe.web.domain;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "user", schema = "smart_cafe")
public class User extends AbstractDomain{
    private static final long serialVersionUID = 4799150320920491185L;

    private String username;
    private String password;
    private String email;
    private String phone;
    private byte enabled;
    private Cafe cafe;
    private Set<UserRole> userRoles;
    private Set<UserHistory> userHistory;

    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "phone", nullable = true, length = 45)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "enabled", nullable = false)
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    public Set<UserHistory> getUserHistory() {
        return userHistory;
    }

    public void setUserHistory(Set<UserHistory> userHistory) {
        this.userHistory = userHistory;
    }
}
