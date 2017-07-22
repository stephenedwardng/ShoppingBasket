package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/07/2017.
 */

public class BasketTest {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;
    Item item4;
    Discount discount;
    Customer customer;


    @Before
    public void before() {
        basket = new Basket(discount);
        item1 = new Item("Mr Men Boxset", 30);
        item2 = new Item("Frozen bike", 90);
        item3 = new Item("Play Doh", 10);
        item4 = new Bogof("Frozen bike", 90);
    }

    @Test
    public void canCountEmptyBasket() {
        assertEquals(0, basket.countItems());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item1);
        assertEquals(1, basket.countItems());
    }

    @Test
    public void canRemoveItem() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        basket.removeItem(item2);
        assertEquals(2, basket.countItems());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.empty();
        assertEquals(0, basket.countItems());
    }

    @Test
    public void checkGrossTotal() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        assertEquals(130, basket.grossTotal());
    }

    @Test
    public void checkGrossTotal_emptyBasket() {
        assertEquals(0, basket.grossTotal());

    }

}
