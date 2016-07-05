package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "recipe_item", schema = "smart_cafe")
public class RecipeItem implements Serializable{
    private static final long serialVersionUID = 431769159450560414L;

    private Integer id;
    private Double quantity;

    public RecipeItem() {
    }

    public RecipeItem(int id, double quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "recipe_item_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "quantity", nullable = false)
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
