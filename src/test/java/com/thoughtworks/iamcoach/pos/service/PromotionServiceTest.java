package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.Dao.PromotionImple;
import com.thoughtworks.iamcoach.pos.module.Promotion;
import com.thoughtworks.iamcoach.pos.module.SeconHalfPromotion;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by wanghuan on 14-10-30.
 */
public class PromotionServiceTest {
    @Test
    public void can_get_promotion_by_type(){
        PromotionService promotionService = new PromotionService();
        promotionService.setPromotionImple(mock_PromotionImple());
        int type = 1;
        assertThat(promotionService.getPromotionByType(type) instanceof SeconHalfPromotion).isTrue();
    }

    private PromotionDao mock_PromotionImple(){
        int type = 1;
        Promotion promotion = new SeconHalfPromotion();

        PromotionDao promotionImple = mock(PromotionImple.class);
        when(promotionImple.getPromotionByType(type)).thenReturn(promotion);
        return promotionImple;
    }
}
