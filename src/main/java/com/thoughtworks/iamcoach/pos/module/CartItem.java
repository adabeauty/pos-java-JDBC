package com.thoughtworks.iamcoach.pos.module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartItem extends Item{
    private double num;
    private List<Promotion> promotionList = new ArrayList<Promotion>();

    public CartItem(Item item, double num, ArrayList<Promotion> promotionList) {
        super(item.getCategoryId(), item.getBarcode(), item.getName(), item.getUnit(), item.getPrice());
        this.num = num;
        this.promotionList = promotionList;
    }

    public double getNum() {
        return this.num;
    }

    public void setNum(double num) {
        this.num  = num;
    }

    public List<Promotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }
    public double getSubtotal() {
        ArrayList<Double> allSubTotals = new ArrayList<Double>();

        Item item = new Item(this.getCategoryId(), this.getBarcode(), this.getName(), this.getUnit(), this.getPrice());
        CartItem cartItem = new CartItem(item, this.num);

        for(int i=0; i<getPromotion().size(); i++){
            if(getPromotion().get(i).equals("buy_two_get_one_free_promotion")){
                BuyTwoOneFreeCalculator buyTwoOneFreeCalculator = new BuyTwoOneFreeCalculator();
                allSubTotals.add(buyTwoOneFreeCalculator.calculatePromotion(cartItem));
            }
            if(getPromotion().get(i).equals("second_half_price_promotion")){
                SecondHalfCalculator secondHalfCalculator = new SecondHalfCalculator();
                allSubTotals.add(secondHalfCalculator.calculatePromotion(cartItem));
            }
            if(getPromotion().get(i).equals("discount_promotion")){
                DiscountCalculator discountCalculator = new DiscountCalculator();
                allSubTotals.add(discountCalculator.calculatePromotion(cartItem));
            }
        }


        return Collections.min(allSubTotals);
    }
}
