package com.example.user.shoppingbasket;

/**
 * Created by user on 22/07/2017.
 */

public class Customer {

    private String name;
    private boolean loyaltyCard;

    public Customer(String name, boolean loyaltyCard) {

        this.name = name;
        this.loyaltyCard = loyaltyCard;

    }

    public String getName() {

        return name;

    }

    public boolean hasLoyaltyCard() {

        return loyaltyCard;

    }
}
