package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 22/07/2017.
 */

public class Discount implements Discountable {

    private Basket basket;
    private Customer customer;
    private final int TWENTYPOUND = 20;

    public Discount(Basket basket, Customer customer) {

        this.basket = basket;
        this.customer = customer;

    }

    // I want to make this method private because it is called only from within the class
    // However, I am directly testing the method and the JUnit test class then cannot access the method if made private
    public int applyTwentyPoundDiscount() {

        double twentyPoundDiscount = basket.grossTotal();

        if (basket.grossTotal() > TWENTYPOUND) {
            twentyPoundDiscount = basket.grossTotal() * 0.9;
        }

        return (int)Math.round(twentyPoundDiscount);

    }

    // As above comment
    public int applyLoyaltyDiscount() {

        double loyaltyDiscount = applyTwentyPoundDiscount();

        if (customer.hasLoyaltyCard()) {
            loyaltyDiscount = applyTwentyPoundDiscount() * 0.98;
        }

        return (int)Math.round(loyaltyDiscount);

    }

    public int discountPrice() {

        return applyLoyaltyDiscount();

    }

}
