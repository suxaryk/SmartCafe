package com.smartcafe.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role extends AbstractModel{

    private static final long serialVersionUID = -8501199485760877095L;

    private String title;


    public Role() {
        super();
    }

    public Role(Long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
