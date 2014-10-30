package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.Dao.PromotionImple;
import com.thoughtworks.iamcoach.pos.module.Promotion;

/**
 * Created by wanghuan on 14-10-30.
 */
public class PromotionService {
    private PromotionDao promotionImple = new PromotionImple();

    public void setPromotionImple(PromotionDao promotionImple) {
        this.promotionImple = promotionImple;
    }
    
    public Promotion getPromotionByType(int type) {
        return promotionImple.getPromotionByType(type);
    }
}
