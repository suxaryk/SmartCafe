package com.smartcafe.web.model;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

    private int dayId;
    private User user;
    private int totalSum;
    private DateTime dateTime;
}
