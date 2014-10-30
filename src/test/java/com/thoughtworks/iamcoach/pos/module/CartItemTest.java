package com.thoughtworks.iamcoach.pos.module;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-30.
 */
public class CartItemTest {
    @Test
    public void can_get_num(){
        CartItem cartItem = new CartItem();
        double num  = 9.0;
        cartItem.setNum(num);
        assertThat(cartItem.getNum()).isEqualTo(9.0);
    }
}
