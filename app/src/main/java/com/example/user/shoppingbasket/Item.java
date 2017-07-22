package com.example.user.shoppingbasket;

/**
 * Created by user on 21/07/2017.
 */

public class Item {

    protected String name;
    protected int recommendedRetailPrice;

    public Item(String name, int recommendedRetailPrice) {

        this.name = name;
        this.recommendedRetailPrice = recommendedRetailPrice;

    }

    public String getName() {

        return name;

    }

    public int getRecommendedRetailPrice() {

        return recommendedRetailPrice;

    }



}
