package com.thoughtworks.iamcoach.pos.module;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private int id;

    private int categoryId;
    private String barcode;
    private String name;
    private String unit;
    private double price;
    private List<Promotion> promotionList = new ArrayList<Promotion>();

    public Item(int categoryId, String barcode, String name, String unit, double price) {
        this.categoryId = categoryId;
        this.barcode = barcode;
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getPrice() {
        return price;
    }

    public List<Promotion> getPromotionList() {
        return promotionList;
    }
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}
