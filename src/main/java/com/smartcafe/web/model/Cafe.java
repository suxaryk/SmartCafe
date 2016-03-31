package com.smartcafe.web.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by suxarina on 3/31/2016.
 */
@Entity
public class Cafe {
    private int id;
    private String title;
    private String adress;
    private String passWifi;
    private String wish;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "adress", nullable = false, length = 100)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "pass_wifi", nullable = false, length = 32)
    public String getPassWifi() {
        return passWifi;
    }

    public void setPassWifi(String passWifi) {
        this.passWifi = passWifi;
    }

    @Basic
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
        if (adress != null ? !adress.equals(cafe.adress) : cafe.adress != null) return false;
        if (passWifi != null ? !passWifi.equals(cafe.passWifi) : cafe.passWifi != null) return false;
        if (wish != null ? !wish.equals(cafe.wish) : cafe.wish != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (passWifi != null ? passWifi.hashCode() : 0);
        result = 31 * result + (wish != null ? wish.hashCode() : 0);
        return result;
    }
}
