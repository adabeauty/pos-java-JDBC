package com.thoughtworks.iamcoach.pos;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by wanghuan on 14-10-29.
 */
public class CategoryTest {
    @Test
    public void can_get_category_paraments(){
        String name = "drink";
        Category category = new Category(name);

        assertThat(category.getId()).isEqualTo(0);
        assertThat(category.getName()).isEqualTo(name);
    }
}
