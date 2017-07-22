package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 21/07/2017.
 */

public class Basket{

    private ArrayList<Item> items;
    private Discountable discount;

    public Basket(Discountable discount) {
        items = new ArrayList<Item>();
        this.discount = discount;
    }

    public int countItems() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        int index = items.indexOf(item);
        items.remove(index);
    }

    public void empty() {
        items.clear();
    }

    // make private
    public int grossTotal() {

        int grossTotal = 0;

        for (Item item : items) {
            grossTotal += item.getRecommendedRetailPrice();
        }

        return grossTotal;

    }

    public int discountPrice() {
        return discount.discountPrice();
    }


}
