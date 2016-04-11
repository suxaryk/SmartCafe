package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by suxarina on 4/11/2016.
 */
@Entity
@Table(name = "order_item", schema = "smart_cafe", catalog = "")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 7635981821785039844L;

    private int id;
    private int quantity;

    public OrderItem() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (id != orderItem.id) return false;
        if (quantity != orderItem.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + quantity;
        return result;
    }
}
