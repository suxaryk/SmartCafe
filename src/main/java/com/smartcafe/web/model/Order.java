package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "order", schema = "smart_cafe")
public class Order implements Serializable{
    private static final long serialVersionUID = 1679663986952911499L;

    private Long id;
    private Timestamp dateTime;
    private Integer totalPrice;
    private Set<OrderItem> orderItems = new HashSet<>(0);
    private User user;


    public Order() {
    }

    public Order(long id, Timestamp dateTime, int totalPrice, Set<OrderItem> orderItems) {
        this.id = id;
        this.dateTime = dateTime;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
    }

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "order_id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @OneToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
