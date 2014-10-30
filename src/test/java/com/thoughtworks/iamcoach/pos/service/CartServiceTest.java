package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import java.util.ArrayList;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-30.
 */
public class CartServiceTest {

    @Test
    public void can_get_all_cartItems(){
        ArrayList<String> inputs = null;
        ArrayList<String> items = null;
        CartService cartService = new CartService();

        assertThat(cartService.getCartInfo().size()).isEqualTo(3);
    }
}
