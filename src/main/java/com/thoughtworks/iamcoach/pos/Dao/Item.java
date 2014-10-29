package com.thoughtworks.iamcoach.pos.Dao;

import com.thoughtworks.iamcoach.pos.Category;
import com.thoughtworks.iamcoach.pos.module.Promotion;

import java.util.ArrayList;

public interface Item {
    public interface ItemInterface {
        Item getItemByBarcode(String barcode);

        void insertItem(Item item);

        void deleteItem(String barcode);

        void updateItem(String barcode);

        ArrayList<Item> getItems();

        ArrayList<Promotion> getPromotionOfItem(int id);

        Category getCategory(int id);
    }
}
