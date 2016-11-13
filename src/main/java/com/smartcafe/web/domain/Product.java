package com.smartcafe.web.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product", schema = "smart_cafe")
public class Product extends AbstractDomain{
    private static final long serialVersionUID = -6897519954136772648L;

    private String title;
    private Double quantity;
    private Set<Dish> dishes;
    private Set<ProductHistory> productHistory;

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
