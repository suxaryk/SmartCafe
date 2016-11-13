package com.smartcafe.web.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "order", schema = "smart_cafe")
public class Order extends AbstractDomain {
    private static final long serialVersionUID = 1679663986952911499L;

    private Timestamp dateTime;
    private Integer totalPrice;
    private Set<OrderItem> orderItems;
    private User user;

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
