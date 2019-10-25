package com.example.assignment1;

public class Food {

    private int foodId;
    private String name;
    private String description;
    private String price;
    private int imageDrawableId;

    public Food (int foodId, String name, String description, String price, int imageDrawableId) {
        this.foodId = foodId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageDrawableId = imageDrawableId;
    }


    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }
}
