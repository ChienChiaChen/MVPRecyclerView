package com.chiachen.bookmvpexample.data;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public class Book {
    private String type;
    private double price;
    private int amount;

    public Book(String type, double price, int amount) {
        this.type = type;
        this.price = price;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public Book setType(String type) {
        this.type = type;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Book setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
