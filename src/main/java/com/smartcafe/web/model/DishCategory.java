package com.smartcafe.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="dish_category")
public class DishCategory extends AbstractModel{

    private static final long serialVersionUID = -2524340722817554048L;

    private String title;

    public DishCategory() {
        super();
    }

    public DishCategory(Long id) {
        super(id);
    }
}
