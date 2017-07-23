package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class CustomerDiscountTest {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;
    Discountable discount;
    Shoppable customer;
    Shoppable staff;


    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Mr Men Boxset", 30);
        item2 = new Item("Frozen bike", 90);
        item3 = new Item("Play Doh", 10);
    }

    @Test
    public void canApplyTwentyPoundDiscount__over_20_pound() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        discount = new CustomerDiscount(basket, customer);
        assertEquals(117, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyTwentyPoundDiscount__under_20_pound() {
        basket.addItem(item3);
        discount = new CustomerDiscount(basket, customer);
        assertEquals(10, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyLoyaltyDiscount__has_loyalty_card() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        customer = new Customer("Eddie Ng", true);
        discount = new CustomerDiscount(basket, customer);
        assertEquals(115, discount.applyCardDiscount());
    }

    @Test
    public void canApplyLoyaltyDiscount__no_loyalty_card() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        customer = new Customer("Eddie Ng", false);
        discount = new CustomerDiscount(basket, customer);
        assertEquals(117, discount.applyCardDiscount());
    }


}
