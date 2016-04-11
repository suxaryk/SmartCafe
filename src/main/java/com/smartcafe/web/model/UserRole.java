package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by suxarina on 4/11/2016.
 */
@Entity
@Table(name = "user_role", schema = "smart_cafe", catalog = "")
public class UserRole implements Serializable{
    private static final long serialVersionUID = 3335943993008800669L;

    private int id;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
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
