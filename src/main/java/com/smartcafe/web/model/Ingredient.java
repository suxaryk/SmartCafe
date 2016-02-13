package com.smartcafe.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ingredient")
public class Ingredient extends AbstractModel{

    private static final long serialVersionUID = -3542152194094953363L;

    public Ingredient() {
        super();
    }

    public Ingredient(Long id) {
        super(id);
    }
}
