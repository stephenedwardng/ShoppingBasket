package com.example.user.shoppingbasket;

/**
 * Created by user on 22/07/2017.
 */

public class CustomerDiscount implements Discountable {

    private Basket basket;
    private Shoppable customer;
    private final int TWENTYPOUND = 20;

    public CustomerDiscount(Basket basket, Shoppable customer) {

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

    public int applyCardDiscount() {

        double loyaltyDiscount = applyPercentageDiscount();

        if (customer.hasCard()) {
            loyaltyDiscount = applyPercentageDiscount() * 0.98;
        }

        return (int)Math.round(loyaltyDiscount);

    }

    public int discountPrice() {

        return applyCardDiscount();

    }

}
