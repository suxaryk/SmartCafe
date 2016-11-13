package com.smartcafe.web.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "cafe" , schema = "smart_cafe")
public class Cafe extends AbstractDomain  {
    private static final long serialVersionUID = -8002615824986234456L;

    private String title;
    private String address;
    private String passWifi;
    private String wish;
    private Integer tableCount;
    private Set<User> users;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cafe", cascade = CascadeType.ALL)
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
