package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by suxarina on 4/11/2016.
 */
@Entity
@Table(name = "cafe")
public class Cafe implements Serializable {
    private static final long serialVersionUID = -8002615824986234456L;

    private Integer id;
    private String title;
    private String address;
    private String passWifi;
    private String wish;

    public Cafe() {
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

    @Column(name = "title", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "address", nullable = false, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "pass_wifi", nullable = false, length = 32)
    public String getPassWifi() {
        return passWifi;
    }

    public void setPassWifi(String passWifi) {
        this.passWifi = passWifi;
    }

    @Column(name = "wish", nullable = true, length = 50)
    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cafe cafe = (Cafe) o;

        if (id != cafe.id) return false;
        if (title != null ? !title.equals(cafe.title) : cafe.title != null) return false;
        if (address != null ? !address.equals(cafe.address) : cafe.address != null) return false;
        if (passWifi != null ? !passWifi.equals(cafe.passWifi) : cafe.passWifi != null) return false;
        if (wish != null ? !wish.equals(cafe.wish) : cafe.wish != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (passWifi != null ? passWifi.hashCode() : 0);
        result = 31 * result + (wish != null ? wish.hashCode() : 0);
        return result;
    }
}
