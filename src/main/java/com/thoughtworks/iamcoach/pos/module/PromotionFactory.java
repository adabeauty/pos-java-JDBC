package com.thoughtworks.iamcoach.pos.module;

/**
 * Created by wanghuan on 14-10-30.
 */
public class PromotionFactory {
    public static final int BUY_TWO_ONE_FREE = 1;
    public static final int SECOND_HALF = 2;
    public static final int DISCOUNT = 3;

    public static Promotion generatePromotion(int type) {
        Promotion promotion = null;
        switch(type){
            case BUY_TWO_ONE_FREE:
                promotion = new BuyTwoOneFreePromotion();
                break;
            case SECOND_HALF:
                promotion = new SeconHalfPromotion();
                break;
            case DISCOUNT:
                promotion = new DiscountPromotion();
                break;

        }
        return promotion;

    }
}
