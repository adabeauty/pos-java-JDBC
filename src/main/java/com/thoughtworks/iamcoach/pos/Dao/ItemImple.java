package com.thoughtworks.iamcoach.pos.Dao;

import com.thoughtworks.iamcoach.pos.Category;
import com.thoughtworks.iamcoach.pos.module.Item;
import com.thoughtworks.iamcoach.pos.module.Promotion;

import java.util.ArrayList;

public class ItemImple implements ItemDao {

    @Override
    public Item getItemByBarcode(String barcode) {
        return null;
    }

    @Override
    public ArrayList<ItemDao> getItems() {
        return null;
    }

    @Override
    public ArrayList<Promotion> getPromotionOfItem(int id) {
        return null;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}
