package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ItemServiceTest {
    @Test
    public void can_get_all_items(){
        ItemService itemService = new ItemService();
        assertThat(itemService.getItems().size()).isEqualTo(5);
    }

}
