package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "user_role", schema = "smart_cafe")
public class UserRole implements Serializable{
    private static final long serialVersionUID = 3335943993008800669L;

    private Integer id;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_role_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (id != userRole.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
