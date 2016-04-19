package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "dish", schema = "smart_cafe")
public class Dish implements Serializable{
    private static final long serialVersionUID = 9167452444948699476L;

    private int id;
    private String title;
    private int unitPrice;
    private Category category;
    private Set<Product> products = new HashSet<>(0);

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

    @ManyToOne
    @JoinColumn(name = "dish_category_id")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "dish_product", joinColumns = {
            @JoinColumn(name = "id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id",
                    nullable = false, updatable = false) })
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> recipe) {
        this.products = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        if (id != dish.id) return false;
        if (unitPrice != dish.unitPrice) return false;
        if (title != null ? !title.equals(dish.title) : dish.title != null) return false;
        return category != null ? category.equals(dish.category) : dish.category == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + unitPrice;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
