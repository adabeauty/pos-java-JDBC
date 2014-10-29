package com.thoughtworks.iamcoach.pos.module;

/**
 * Created by wanghuan on 14-10-29.
 */
public class Promotion {

    private int id;
    private int type;
    private String description;

    public Promotion(int id, int type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
