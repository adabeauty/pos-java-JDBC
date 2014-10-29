package com.thoughtworks.iamcoach.pos.module;

public class DiscountPromotion extends Promotion{
    private double discount;

    public DiscountPromotion() {
    }

    public DiscountPromotion(int id, int type, String description, double discount) {
        super(id, type, description);
        this.discount = discount;
    }

    @Override
    public double calcultaPromotion(Item item, double num) {
        return item.getPrice() * num * discount;
    }
}
