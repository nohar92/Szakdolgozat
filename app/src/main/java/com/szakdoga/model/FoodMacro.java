package com.szakdoga.model;

public class FoodMacro {

    public FoodMacro() {

    }

    private int id;
    private String category;
    private String foodName;
    private int kCal;
    private double protein;
    private double carbohydrate;
    private double fat;
    private String image;

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) {this.category = category; }

    public String getFoodName() { return foodName; }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getKcal() {
        return kCal;
    }

    public void setKcal(int kCal) {
        this.kCal = kCal;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
