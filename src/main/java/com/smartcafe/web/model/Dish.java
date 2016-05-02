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

    private Integer id;
    private String title;
    private Integer unitPrice;
    private Category category;
    private Set<Product> products = new HashSet<>(0);


    public Dish() {
    }

    public Dish(int id, String title, int unitPrice, Category category, Set<Product> products) {
        this.id = id;
        this.title = title;
        this.unitPrice = unitPrice;
        this.category = category;
        this.products = products;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "dish_id", nullable = false)
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
    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "recipe_item", joinColumns = {
            @JoinColumn(name = "dish_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "product_id",
                    nullable = false, updatable = false) })
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> recipe) {
        this.products = recipe;
    }

}
