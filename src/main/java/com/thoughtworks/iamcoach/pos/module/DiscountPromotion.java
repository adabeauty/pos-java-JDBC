package com.thoughtworks.iamcoach.pos.module;

public class DiscountPromotion extends Promotion{

    @Override
    public double calcultaPromotion(Item item, double num) {
        return item.getPrice() * num * getDiscount();
    }
}
