package com.szakdoga.model;

public class FoodModel {

    FoodMacro foodMacro;
    CalculationModel calcModel;

    public FoodModel(FoodMacro foodMacro,CalculationModel calcModel){
        this.foodMacro = foodMacro;
        this.calcModel = calcModel;

    }



    public int getBulkingBreakfastAmount(){
        double maxCalorie =  calcModel.bulking() * 0.30;
        return (int) ((maxCalorie/ foodMacro.getKcal())*100);
    }

    public int getBulkingLunchAmount(){
        double maxCalorie =  (calcModel.bulking() *0.45);
        return (int) (maxCalorie/ foodMacro.getKcal())*100;
    }

    public int getBulkingDinnerAmount(){
        double maxCalorie =  (calcModel.bulking() *0.25);
        return (int) (maxCalorie/ foodMacro.getKcal())*100;
    }

    public int getCuttingBreakfastAmount(){
        double maxCalorie =  calcModel.cutting() * 0.35;
        return (int) ((maxCalorie/ foodMacro.getKcal())*100);
    }

    public int getCuttingLunchAmount(){
        double maxCalorie =  (calcModel.cutting() *0.45);
        return (int) (maxCalorie/ foodMacro.getKcal())*100;
    }

    public int getCuttingDinnerAmount(){
        double maxCalorie =  (calcModel.cutting() *0.2);
        return (int) (maxCalorie/ foodMacro.getKcal())*100;
    }

    public int getMaintanBreakfastAmount(){
        double maxCalorie =  calcModel.maintenance() * 0.35;
        return (int) ((maxCalorie/ foodMacro.getKcal())*100);
    }

    public int getMaintanLunchAmount(){
        double maxCalorie =  (calcModel.maintenance() *0.35);
        return (int) (maxCalorie/ foodMacro.getKcal())*100;
    }

    public int getMaintanDinnerAmount(){
        double maxCalorie =  (calcModel.maintenance() *0.3);
        return (int) (maxCalorie/ foodMacro.getKcal())*100;
    }

/*public double getMethodResponse(String method){

        switch (method){
            case "bulking":
                return calcModel.bulking();
                break;
            case "cutting":
                return calcModel.cutting();
            case "cutting":
                return calcModel.cutting();
        }

}*/


}
