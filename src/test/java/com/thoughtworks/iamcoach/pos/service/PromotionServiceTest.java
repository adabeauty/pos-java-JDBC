package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.*;
import com.thoughtworks.iamcoach.pos.module.*;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

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
