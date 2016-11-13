package com.smartcafe.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "recipe_item", schema = "smart_cafe")
public class RecipeItem extends AbstractDomain{
    private static final long serialVersionUID = 431769159450560414L;

    private Double quantity;

    @Column(name = "quantity", nullable = false)
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
