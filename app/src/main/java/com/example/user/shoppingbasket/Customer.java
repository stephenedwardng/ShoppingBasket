package com.example.user.shoppingbasket;

/**
 * Created by user on 22/07/2017.
 */

public class Customer implements Shoppable {

    private String name;
    private boolean loyaltyCard;

    public Customer(String name, boolean loyaltyCard) {

        this.name = name;
        this.loyaltyCard = loyaltyCard;

    }

    public String getName() {

        return name;

    }

    public boolean hasCard() {

        return loyaltyCard;

    }
}
