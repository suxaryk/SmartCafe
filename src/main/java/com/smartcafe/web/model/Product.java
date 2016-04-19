package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "product", schema = "smart_cafe")
public class Product implements Serializable{
    private static final long serialVersionUID = -6897519954136772648L;

    private int id;
    private String title;
    private int quantity;
    private Set<Dish> dishes = new HashSet<>(0);

    public Product() {
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

    @Column(name = "title", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (quantity != product.quantity) return false;
        if (title != null ? !title.equals(product.title) : product.title != null) return false;
        return dishes != null ? dishes.equals(product.dishes) : product.dishes == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (dishes != null ? dishes.hashCode() : 0);
        return result;
    }
}
