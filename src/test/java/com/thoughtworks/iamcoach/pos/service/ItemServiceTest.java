package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.ItemImple;
import com.thoughtworks.iamcoach.pos.module.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemServiceTest {
    @Test
    public void can_get_all_items(){
        ItemService itemService = new ItemService();
        assertThat(itemService.getItems().size()).isEqualTo(5);
    }


    @Test
    public void can_get_item_by_barcode(){
        ItemService itemService = new ItemService();
        Item item = new Item(3,"TF1001", "apple", "kg", 8.0);
        String barcode = "TF1001";
        assertThat(itemService.getItemByBarcode(barcode).toString()).isEqualTo(item.toString());
    }

    @Test
    public void can_get_promotions_of_item(){
        ItemService itemService = new ItemService();
        int id = 1;
        assertThat(itemService.getPromotions(id).size()).isEqualTo(3);
    }

    @Test
    public void can_get_category_of_item(){
        ItemService itemService = new ItemService();
        int id = 1;
        Category category = new Category("fruit");
        assertThat(itemService.getCategory(id).toString()).isEqualTo(category.toString());
    }

    private void mock_ItemImple(){
        ArrayList<Item> items = new ArrayList<Item>();
        Item item = new Item(3,"TF1001", "apple", "kg", 8.0);
        items.add(item);

        ArrayList<Promotion> promotions = new ArrayList<Promotion>();
        Promotion promotion = new Promotion(1, 1, "buy_two_one_free");
        promotions.add(promotion);

        String barcode = null;
        int id = 1;
        Category category = new Category("fruit");
        
        ItemImple itemImple = mock(ItemImple.class);
        when(itemImple.getItems()).thenReturn(items);
        when(itemImple.getItemByBarcode(barcode)).thenReturn(item);
        when(itemImple.getPromotions(id)).thenReturn(promotions);
        when(itemImple.getCategory(id)).thenReturn(category);
    }

}
