package com.smartcafe.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends AbstractModel {

    private static final long serialVersionUID = -9171487188161445633L;

    private String username;
    private String password;

    public User() {
        super();
    }

    public User(Long id) {
        super(id);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
