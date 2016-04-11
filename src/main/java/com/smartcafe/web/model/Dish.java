package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by suxarina on 4/11/2016.
 */
@Entity
@Table(name = "dish")
public class Dish implements Serializable {
    private static final long serialVersionUID = 9167452444948699476L;

    private Integer id;
    private String title;
    private int unitPrice;

    public Dish() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "unit_price", nullable = false)
    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        if (id != dish.id) return false;
        if (unitPrice != dish.unitPrice) return false;
        if (title != null ? !title.equals(dish.title) : dish.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + unitPrice;
        return result;
    }
}
