package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_item", schema = "smart_cafe")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 7635981821785039844L;

    private int id;
    private int quantity;
    private Dish dish;
    private Order order;

    public OrderItem() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "orderItem",cascade = CascadeType.ALL)
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
