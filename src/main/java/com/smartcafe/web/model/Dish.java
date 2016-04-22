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
    private OrderItem orderItem;

    public Dish() {
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
    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
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
    @JoinTable(name = "dish_product", joinColumns = {
            @JoinColumn(name = "dish_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "product_id",
                    nullable = false, updatable = false) })
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> recipe) {
        this.products = recipe;
    }

    @OneToOne
    @PrimaryKeyJoinColumn
    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
}
