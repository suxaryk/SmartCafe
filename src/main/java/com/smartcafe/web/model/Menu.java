package com.smartcafe.web.model;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "menu" , schema = "smart_cafe")
public class Menu  implements Serializable{
    private static final long serialVersionUID = -4470604468449685980L;

    private Integer id;
    private String title;
    private Set<Category> categories = new HashSet<>(0);

    public Menu() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int menuId) {
        this.id = menuId;
    }

    @Basic
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
