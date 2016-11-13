package com.smartcafe.web.domain;

import javax.persistence.*;

@Entity
@Table(name = "order_item", schema = "smart_cafe")
public class OrderItem extends AbstractDomain {
    private static final long serialVersionUID = 7635981821785039844L;

    private Integer quantity;
    private Dish dish;
    private Order order;

    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    @ManyToOne
    @JoinColumn(name = "order_id")
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
