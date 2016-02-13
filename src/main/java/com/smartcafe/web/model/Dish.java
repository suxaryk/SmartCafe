package com.smartcafe.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name="dish")
public class Dish extends AbstractModel {

    private static final long serialVersionUID = -2812661104204342177L;

    private String title;
    private Integer price;

    private Set<Ingredient> recipe;
    private DishCategory dishCategory;

    public Dish() {
        super();
    }

    public Dish(Long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
