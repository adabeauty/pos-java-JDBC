package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.ItemImple;
import com.thoughtworks.iamcoach.pos.module.Category;
import com.thoughtworks.iamcoach.pos.module.Item;
import com.thoughtworks.iamcoach.pos.module.Promotion;

import java.util.ArrayList;

/**
 * Created by wanghuan on 14-10-29.
 */
public class ItemService {
    ItemImple itemImple = new ItemImple();
    public ArrayList<Item> getItems() {
        return itemImple.getItems();
    }

    public Item getItemByBarcode(String barcode) {
        return itemImple.getItemByBarcode(barcode);
    }

    public ArrayList<Promotion> getPromotions(int id) {
        return itemImple.getPromotions(id);
    }

    public Category getCategory(int id) {
        return itemImple.getCategory(id);
    }
}
