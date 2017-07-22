package com.example.user.shoppingbasket;

/**
 * Created by user on 22/07/2017.
 */

public class Bogof extends Item {

    private String name;
    private int recommendedRetailPrice;

    public Bogof(String name, int recommendedRetailPrice) {

        super(name, recommendedRetailPrice);

    }

    @Override
    public int getPrice() {

        return 0;

    }


}
