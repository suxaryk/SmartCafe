package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "role", schema = "smart_cafe")
public class Role implements Serializable{
    private static final long serialVersionUID = 592150238087646495L;

    private Integer id;
    private String type;

    public Role() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "role_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
