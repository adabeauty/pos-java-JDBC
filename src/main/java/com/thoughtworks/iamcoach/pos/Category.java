package com.thoughtworks.iamcoach.pos;

/**
 * Created by wanghuan on 14-10-29.
 */
public class Category {
    private int id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
