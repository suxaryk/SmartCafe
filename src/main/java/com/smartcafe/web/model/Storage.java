package com.smartcafe.web.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="storage")
public class Storage extends AbstractModel {

    private static final long serialVersionUID = 5998364426437383723L;

    private String title;
    private Double count;

    public Storage() {
        super();
    }

    public Storage(Long id) {
        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }
}
