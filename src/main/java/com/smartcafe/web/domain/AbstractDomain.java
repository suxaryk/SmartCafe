package com.smartcafe.web.domain;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@MappedSuperclass
public abstract class AbstractDomain implements Serializable{
    private static final String C_ID = "id";
    private Long id;

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = C_ID, nullable = false)
    public Long getId() {
        return id;
    }
}
