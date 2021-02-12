package com.szakdoga.model;

public class FoodModel {

    FoodMacro foodMacro;
    CalculationModel calcModel;

    public FoodModel(FoodMacro foodMacro){
        this.foodMacro = foodMacro;

    }

    public int getBreakfastAmount(){
        int maxCalorie = (int) (calcModel.totalEnergy() * 0.35);
        return (maxCalorie/ foodMacro.getCalorie())*100;
    }

    public int getLunchAmount(){
        int maxCalorie = (int) (calcModel.totalEnergy() *0.45);
        return (maxCalorie/ foodMacro.getCalorie())*100;
    }

    public int getDinnerAmount(){
        int maxCalorie = (int) (calcModel.totalEnergy() *0.3);
        return (maxCalorie/ foodMacro.getCalorie())*100;
    }

}
