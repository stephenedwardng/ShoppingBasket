package com.example.user.shoppingbasket;

/**
 * Created by user on 22/07/2017.
 */

public class Discount {

    private Basket basket;
    private Customer customer;
    private final int TWENTYPOUND = 20;

    public Discount(Basket basket, Customer customer) {
        this.basket = basket;
        this.customer = customer;
    }

    public int applyTwentyPoundDiscount() {

        double twentyPoundDiscount = basket.grossTotal();

        if (basket.grossTotal() > TWENTYPOUND) {
            twentyPoundDiscount = basket.grossTotal() * 0.9;
        }

        return (int)twentyPoundDiscount;

    }

    public int applyLoyaltyDiscount() {

        double loyaltyDiscount = applyTwentyPoundDiscount();

        if (customer.hasLoyaltyCard()) {
            loyaltyDiscount = applyTwentyPoundDiscount() * 0.98;
        }

        return (int)loyaltyDiscount;
    }

}
