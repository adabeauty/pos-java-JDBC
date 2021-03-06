package com.thoughtworks.iamcoach.pos.module;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-30.
 */
public class BuyTwoOneFreePromotionTest{
    @Test
    public void can_calculate_BuyTwoOneFreePromotion(){
        Item item = new Item(null, 3, "TF1001", "apple", "kg", 8.00);
        double num = 3.0;
        BuyTwoOneFreePromotion buyTwoOneFreePromotion = new BuyTwoOneFreePromotion(1, 1, "buy_two_one_free", 1);
        assertThat(buyTwoOneFreePromotion.calcultaPromotion(item, num)).isEqualTo(16.0);
    }
}
