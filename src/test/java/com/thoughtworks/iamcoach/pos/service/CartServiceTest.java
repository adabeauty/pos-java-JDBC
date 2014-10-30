package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CartServiceTest {

    @Test
    public void can_get_all_cartItems(){
        CartService cartService = new CartService();
        assertThat(cartService.getCartInfo().size()).isEqualTo(3);
        assertThat(cartService.getCartInfo().get(0).getNum()).isEqualTo(5);
        assertThat(cartService.getCartInfo().get(1).getNum()).isEqualTo(2.0);
    }
}
