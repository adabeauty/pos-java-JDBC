package com.thoughtworks.iamcoach.pos.Dao;

import com.thoughtworks.iamcoach.pos.Category;
import com.thoughtworks.iamcoach.pos.module.Item;
import com.thoughtworks.iamcoach.pos.module.Promotion;

import java.util.ArrayList;

public interface ItemDao {
    public interface ItemInterface {
        Item getItemByBarcode(String barcode);

        ArrayList<ItemDao> getItems();

        ArrayList<Promotion> getPromotionOfItem(int id);

        Category getCategory(int id);
    }
}
