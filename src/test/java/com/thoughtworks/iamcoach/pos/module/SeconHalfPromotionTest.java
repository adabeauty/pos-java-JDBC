package com.thoughtworks.iamcoach.pos.module;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-30.
 */
public class SeconHalfPromotionTest {
    @Test
    public void can_get_SecondHalfPromotion(){
        Item item = new Item(null, 3, "TF1001", "apple", "kg", 8.00);
        double num = 2.0;

        SeconHalfPromotion seconHalfPromotion = new SeconHalfPromotion(1, 1, "second_half_price", 1);
        assertThat(seconHalfPromotion.calcultaPromotion(item, num)).isEqualTo(12.0);
    }
}
