package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.module.BuyTwoOneFreePromotion;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-30.
 */
public class PromotionServiceTest {
    @Test
    public void can_get_promotion_by_type(){
        PromotionService promotionService = new PromotionService();
        int type = 1;
        assertThat(promotionService.getPromotionByType(type) instanceof BuyTwoOneFreePromotion).isTrue();
    }

}
