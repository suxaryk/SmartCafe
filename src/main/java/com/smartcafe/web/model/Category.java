package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "category", schema = "smart_cafe")
public class Category implements Serializable{
    private static final long serialVersionUID = -7953731961098354542L;

    private Integer id;
    private String title;
    private Set<Dish> dishes = new HashSet<>(0);
    private Menu menu;

    public Category() {
    }

    public Category(int id, String title, Set<Dish> dishes) {
        this.id = id;
        this.title = title;
        this.dishes = dishes;
    }

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "category_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
