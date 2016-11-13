package com.smartcafe.web.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dish", schema = "smart_cafe")
public class Dish extends AbstractDomain{
    private static final long serialVersionUID = 9167452444948699476L;

    private String title;
    private Integer unitPrice;
    private Category category;
    private Set<Product> products;

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
