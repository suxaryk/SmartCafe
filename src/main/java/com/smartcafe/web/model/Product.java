package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "product", schema = "smart_cafe")
public class Product implements Serializable{
    private static final long serialVersionUID = -6897519954136772648L;

    private Integer id;
    private String title;
    private Double quantity;
    private Set<Dish> dishes = new HashSet<>(0);
    private Set<ProductHistory> productHistory = new HashSet<>(0);

    public Product() {
    }

    public Product(int id, String title, double quantity, Set<Dish> dishes, Set<ProductHistory> productHistory) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.dishes = dishes;
        this.productHistory = productHistory;
    }

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "product_id", nullable = false)
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
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product", cascade = CascadeType.ALL)
    public Set<ProductHistory> getProductHistory() {
        return productHistory;
    }

    public void setProductHistory(Set<ProductHistory> productHistory) {
        this.productHistory = productHistory;
    }


}
