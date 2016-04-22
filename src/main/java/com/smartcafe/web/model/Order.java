package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order", schema = "smart_cafe")
public class Order implements Serializable{
    private static final long serialVersionUID = 1679663986952911499L;

    private Integer id;
    private Timestamp dateTime;
    private Integer totalPrice;
    private Set<OrderItem> orderItems = new HashSet<>(0);


    public Order() {
    }

    public Order(int id, Timestamp dateTime, int totalPrice, Set<OrderItem> orderItems) {
        this.id = id;
        this.dateTime = dateTime;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
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

    @Column(name = "date_time", nullable = false)
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Column(name = "total_price", nullable = false)
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
