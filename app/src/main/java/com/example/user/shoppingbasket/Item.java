package com.example.user.shoppingbasket;

import behaviours.Discount;

/**
 * Created by user on 21/07/2017.
 */

public class Item implements Discountable {

    private String name;
    private int price;
    private Discount discount;

    public Item(String name, int price, Discount discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Discount getDiscount() {
        return discount;
    }

}
