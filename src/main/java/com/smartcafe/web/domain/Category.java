package com.smartcafe.web.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category", schema = "smart_cafe")
public class Category extends AbstractDomain{
    private static final long serialVersionUID = -7953731961098354542L;

    private String title;
    private Set<Dish> dishes;
    private Menu menu;

    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL)
    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    @ManyToOne
    @JoinColumn(name = "menu_id")
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
