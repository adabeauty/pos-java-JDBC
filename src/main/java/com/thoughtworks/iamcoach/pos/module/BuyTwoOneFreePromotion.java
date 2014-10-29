package com.thoughtworks.iamcoach.pos.module;

public class BuyTwoOneFreePromotion extends Promotion{
    public BuyTwoOneFreePromotion(int id, int type, String description) {
        super(id, type, description);
    }

    @Override
    public double calcultaPromotion(Item item, double num) {
        double promotionNumber = ((int) num)/3;
        double actualNumber = num - promotionNumber;
        return actualNumber * item.getPrice();
    }
}
