package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/07/2017.
 */

public class BogofTest {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Discountable discount;
    Customer customer;

    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Frozen bike", 90);
        item2 = new Bogof("Frozen bike", 90);
        item3 = new Item("Mr Men Boxset", 30);
        item4 = new Item("Play Doh", 10);
    }

    @Test
    public void canApplyBogof() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.addItem(item4);
        customer = new Customer("Eddie Ng", true);
        discount = new CustomerDiscount(basket, customer);
        assertEquals(4, basket.countItems());
        assertEquals(115, discount.discountPrice());
    }

}
