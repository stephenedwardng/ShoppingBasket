package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/07/2017.
 */

public class ItemTest {

    Item item1;

    @Before
    public void before() {
        item1 = new Item("Mr Men Boxset", 30);
    }

    @Test
    public void canGetName() {
        assertEquals("Mr Men Boxset", item1.getName());
    }

    @Test
    public void canGetRecommendedRetailPrice() {
        assertEquals(30, item1.getPrice());
    }

}
