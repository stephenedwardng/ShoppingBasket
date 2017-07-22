package com.example.user.shoppingbasket;

/**
 * Created by user on 21/07/2017.
 */

public class Item {

    protected String name;
    protected int price;

    public Item(String name, int price) {

        this.name = name;
        this.price = price;

    }

    public String getName() {

        return name;

    }

    public int getPrice() {

        return price;

    }



}
