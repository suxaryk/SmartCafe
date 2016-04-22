package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "product_history", schema = "smart_cafe")
public class ProductHistory implements Serializable{
    private static final long serialVersionUID = 2603643896182676745L;

    private int id;
    private Timestamp date;
    private int quantity;
    private Product product;

    public ProductHistory() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "product_history_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
