package com.smartcafe.web.model;


import java.io.Serializable;

public class AbstractModel implements Serializable{

    private static final long serialVersionUID = 2152643693328563932L;

    private Long id;

    public AbstractModel(){

    }

    public AbstractModel(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
