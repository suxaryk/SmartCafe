package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_item", schema = "smart_cafe")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 7635981821785039844L;

    private Integer id;
    private Integer quantity;
    private Dish dish;
    private Order order;

    public OrderItem() {
    }

    public OrderItem(int id, int quantity, Dish dish, Order order) {
        this.id = id;
        this.quantity = quantity;
        this.dish = dish;
        this.order = order;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_item_id", nullable = false)
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
