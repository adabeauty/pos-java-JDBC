package com.thoughtworks.iamcoach.pos.module;

public abstract class Promotion {

    private int id;
    private int type;
    private String description;

    protected Promotion() {
    }

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

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }

    public abstract double calcultaPromotion(Item item, double num);
}
