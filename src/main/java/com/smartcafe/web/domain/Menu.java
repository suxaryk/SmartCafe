package com.smartcafe.web.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "menu" , schema = "smart_cafe")
public class Menu  extends AbstractDomain{
    private static final long serialVersionUID = -4470604468449685980L;

    private String title;
    private Set<Category> categories = new HashSet<>(0);

    @Column(name = "title", nullable = false, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menu", cascade = CascadeType.ALL)
    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
