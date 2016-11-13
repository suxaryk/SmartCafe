package com.smartcafe.web.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product_history", schema = "smart_cafe")
public class ProductHistory extends AbstractDomain{
    private static final long serialVersionUID = 2603643896182676745L;

    private Timestamp date;
    private Double quantity;
    private Product product;

    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Column(name = "quantity", nullable = false)
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
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
