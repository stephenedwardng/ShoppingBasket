package com.example.user.shoppingbasket;

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

    public int applyPercentageDiscount() {

        double twentyPoundDiscount = basket.grossTotal();

        if (basket.grossTotal() > TWENTYPOUND) {
            twentyPoundDiscount = basket.grossTotal() * 0.9;
        }

        return (int)Math.round(twentyPoundDiscount);

    }

    public int applyLoyaltyDiscount() {

        double loyaltyDiscount = applyPercentageDiscount();

        if (customer.hasLoyaltyCard()) {
            loyaltyDiscount = applyPercentageDiscount() * 0.98;
        }

        return (int)Math.round(loyaltyDiscount);

    }

    public int discountPrice() {

        return applyLoyaltyDiscount();

    }

}
