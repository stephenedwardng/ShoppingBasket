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
    Staff staff;


    @Before
    public void before() {
        basket = new Basket();
        item1 = new Item("Mr Men Boxset", 30);
        item2 = new Item("Frozen bike", 90);
        item3 = new Item("Play Doh", 10);
    }

    @Test
    public void canApplyYearsServiceDiscount__less_than_1_year() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie", true, 0);
        discount = new StaffDiscount(basket, staff);
        assertEquals(117, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyYearsServiceDiscount__2_years() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie", true, 2);
        discount = new StaffDiscount(basket, staff);
        assertEquals(104, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyYearsServiceDiscount__4_years() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie", true, 4);
        discount = new StaffDiscount(basket, staff);
        assertEquals(91, discount.applyPercentageDiscount());
    }

    @Test
    public void canApplyCardDiscount__has_staff_card() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie Ng", true, 0);
        discount = new StaffDiscount(basket, staff);
        assertEquals(111, discount.applyCardDiscount());
    }

    @Test
    public void canApplyStaffDiscount__no_staff_card() {
        basket.addItem(item1);
        basket.addItem(item2);
        basket.addItem(item3);
        staff = new Staff("Eddie Ng", false, 0);
        discount = new StaffDiscount(basket, staff);
        assertEquals(117, discount.applyCardDiscount());
    }

}
