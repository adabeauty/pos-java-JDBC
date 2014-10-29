package com.thoughtworks.iamcoach.pos.module;

public class SeconHalfPromotion extends Promotion{

    @Override
    public double calcultaPromotion(Item item, double num) {
        double promotionNumber = ((int) num)/2;
        double actualNumber = (num - promotionNumber) + promotionNumber/2;
        return actualNumber * item.getPrice();
    }
}
