package com.smartcafe.web.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "cafe" , schema = "smart_cafe")
public class Cafe implements Serializable {
    private static final long serialVersionUID = -8002615824986234456L;

    private Integer id;
    private String title;
    private String address;
    private String passWifi;
    private String wish;
    private Integer tableCount;

    public Cafe() {
    }

    public Cafe(String title, String address, String passWifi, String wish, Integer tableCount) {
        this.title = title;
        this.address = address;
        this.passWifi = passWifi;
        this.wish = wish;
        this.tableCount = tableCount;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "cafe_id", nullable = false)
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

    @Column(name = "table_count", nullable = false)
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }
}
