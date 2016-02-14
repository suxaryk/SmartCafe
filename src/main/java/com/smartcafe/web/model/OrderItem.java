package com.smartcafe.web.model;

public class OrderItem extends AbstractModel {

    private static final long serialVersionUID = 3197967537954868135L;

    private Dish dish;
    private int count;
    private int itemSum;



    public OrderItem() {
        super();
    }

    public OrderItem(Long id) {
        super(id);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getItemSum() {
        return itemSum;
    }

    public void setItemSum(int itemSum) {
        this.itemSum = itemSum;
    }
}
