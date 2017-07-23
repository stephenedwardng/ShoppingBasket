package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 23/07/2017.
 */

public class StaffDiscountTest {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;
    Discountable discount;
    Shoppable staff;


    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Mr Men Boxset", 30);
        item2 = new Item("Frozen bike", 90);
        item3 = new Item("Play Doh", 10);
    }

    @Test
    public void canApplyTenPoundDiscount__over_10_pound() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        discount = new StaffDiscount(basket, staff);
        assertEquals(91, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyTenPoundDiscount__under_10_pound() {
        basket.addItem(item3);
        discount = new StaffDiscount(basket, staff);
        assertEquals(10, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyCardDiscount__has_staff_card() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie Ng", true);
        discount = new StaffDiscount(basket, staff);
        assertEquals(86, discount.applyCardDiscount());
    }

    @Test
    public void canApplyStaffDiscount__no_staff_card() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie Ng", false);
        discount = new StaffDiscount(basket, staff);
        assertEquals(91, discount.applyCardDiscount());
    }

}
