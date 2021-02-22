package com.szakdoga.model;

public class FoodModel {

    FoodMacro[] foodMacro;
    CalculationModel calcModel;

    public FoodModel(FoodMacro[] foodMacro, CalculationModel calcModel) {
        this.foodMacro = foodMacro;
        this.calcModel = calcModel;
    }

 //zero xml's first breakfast
    public int getBulkingBreakfastAmountZero1() {
        double maxCalorie = calcModel.bulking() * 0.30;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);

        return (int) ((maxCalorie / 102) * 100);
    }

    public int getBulkingLunchAmountZero1() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 145) * 100);
    }

    public int getBulkingDinnerAmountZero1() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 71) * 100);
    }

    //zero xml's second breakfast
    public int getBulkingBreakfastAmountZero2() {
        double maxCalorie = calcModel.bulking() * 0.30;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 92) * 100);
    }

    public int getBulkingLunchAmountZero2() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 123) * 100);
    }

    public int getBulkingDinnerAmountZero2() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 80) * 100);
    }

    //zero xml's third breakfast
    public int getBulkingBreakfastAmountZero3() {
        double maxCalorie = calcModel.bulking() * 0.30;
        return (int) ((maxCalorie / 88) * 100);
    }

    public int getBulkingLunchAmountZero3() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 139) * 100);
    }

    public int getBulkingDinnerAmountZero3() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 159) * 100);
    }

    //first xml's first breakfast
    public int getBulkingBreakfastAmountFirst1() {
        double maxCalorie = calcModel.bulking() * 0.30;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 104) * 100);
    }

    public int getBulkingLunchAmountFirst1() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 113) * 100);
    }

    public int getBulkingDinnerAmountFirst1() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 125) * 100);
    }

    //first xml's second breakfast
    public int getBulkingBreakfastAmountFirst2() {
        double maxCalorie = calcModel.bulking() * 0.30;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 162) * 100);
    }

    public int getBulkingLunchAmountFirst2() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 119) * 100);
    }

    public int getBulkingDinnerAmountFirst2() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 136) * 100);
    }

    //first xml's third breakfast
    public int getBulkingBreakfastAmountFirst3() {
        double maxCalorie = calcModel.bulking() * 0.30;
        return (int) ((maxCalorie / 166) * 100);
    }

    public int getBulkingLunchAmountFirst3() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 173) * 100);
    }

    public int getBulkingDinnerAmountFirst3() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 102) * 100);
    }


    //second xml's first breakfast
    public int getBulkingBreakfastAmountSecond1() {
        double maxCalorie = calcModel.bulking() * 0.30;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 203) * 100);
    }

    public int getBulkingLunchAmountSecond1() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 162) * 100);
    }

    public int getBulkingDinnerAmountSecond1() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 207) * 100);
    }

    //second xml's second breakfast
    public int getBulkingBreakfastAmountSecond2() {
        double maxCalorie = calcModel.bulking() * 0.30;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 160) * 100);
    }

    public int getBulkingLunchAmountSecond2() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 167) * 100);
    }

    public int getBulkingDinnerAmountSecond2() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 91) * 100);
    }

    //second xml's third breakfast
    public int getBulkingBreakfastAmountSecond3() {
        double maxCalorie = calcModel.bulking() * 0.30;
        return (int) ((maxCalorie / 183) * 100);
    }

    public int getBulkingLunchAmountSecond3() {
        double maxCalorie = (calcModel.bulking() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 196) * 100);
    }

    public int getBulkingDinnerAmountSecond3() {
        double maxCalorie = (calcModel.bulking() * 0.25);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 111) * 100);
    }

    ////////////////////////////////
    //zero xml's first breakfast
    public int getCuttingBreakfastAmountZero1() {
        double maxCalorie = calcModel.cutting() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);

        return (int) ((maxCalorie / 102) * 100);
    }

    public int getCuttingLunchAmountZero1() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 145) * 100);
    }

    public int getCuttingDinnerAmountZero1() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 71) * 100);
    }

    //zero xml's second breakfast
    public int getCuttingBreakfastAmountZero2() {
        double maxCalorie = calcModel.cutting() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 92) * 100);
    }

    public int getCuttingLunchAmountZero2() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 123) * 100);
    }

    public int getCuttingDinnerAmountZero2() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 80) * 100);
    }

    //zero xml's third breakfast
    public int getCuttingBreakfastAmountZero3() {
        double maxCalorie = calcModel.cutting() * 0.35;
        return (int) ((maxCalorie / 88) * 100);
    }

    public int getCuttingLunchAmountZero3() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 139) * 100);
    }

    public int getCuttingDinnerAmountZero3() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 159) * 100);
    }

    //first xml's first breakfast
    public int getCuttingBreakfastAmountFirst1() {
        double maxCalorie = calcModel.cutting() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 104) * 100);
    }

    public int getCuttingLunchAmountFirst1() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 113) * 100);
    }

    public int getCuttingDinnerAmountFirst1() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 125) * 100);
    }

    //first xml's second breakfast
    public int getCuttingBreakfastAmountFirst2() {
        double maxCalorie = calcModel.cutting() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 162) * 100);
    }

    public int getCuttingLunchAmountFirst2() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 119) * 100);
    }

    public int getCuttingDinnerAmountFirst2() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 136) * 100);
    }

    //first xml's third breakfast
    public int getCuttingBreakfastAmountFirst3() {
        double maxCalorie = calcModel.cutting() * 0.35;
        return (int) ((maxCalorie / 166) * 100);
    }

    public int getCuttingLunchAmountFirst3() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 173) * 100);
    }

    public int getCuttingDinnerAmountFirst3() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 102) * 100);
    }


    //second xml's first breakfast
    public int getCuttingBreakfastAmountSecond1() {
        double maxCalorie = calcModel.cutting() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 203) * 100);
    }

    public int getCuttingLunchAmountSecond1() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 162) * 100);
    }

    public int getCuttingDinnerAmountSecond1() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 207) * 100);
    }

    //second xml's second breakfast
    public int getCuttingBreakfastAmountSecond2() {
        double maxCalorie = calcModel.cutting() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 160) * 100);
    }

    public int getCuttingLunchAmountSecond2() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 167) * 100);
    }

    public int getCuttingDinnerAmountSecond2() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 91) * 100);
    }

    //second xml's third breakfast
    public int getCuttingBreakfastAmountSecond3() {
        double maxCalorie = calcModel.cutting() * 0.35;
        return (int) ((maxCalorie / 183) * 100);
    }

    public int getCuttingLunchAmountSecond3() {
        double maxCalorie = (calcModel.cutting() * 0.45);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 196) * 100);
    }

    public int getCuttingDinnerAmountSecond3() {
        double maxCalorie = (calcModel.cutting() * 0.2);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 111) * 100);
    }
    ///////////////////////////////


    //zero xml's first breakfast
    public int getMaintanBreakfastAmountZero1() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);

        return (int) ((maxCalorie / 102) * 100);
    }

    public int getMaintanLunchAmountZero1() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 145) * 100);
    }

    public int getMaintanDinnerAmountZero1() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 71) * 100);
    }

    //zero xml's second breakfast
    public int getMaintanBreakfastAmountZero2() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 92) * 100);
    }

    public int getMaintanLunchAmountZero2() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 123) * 100);
    }

    public int getMaintanDinnerAmountZero2() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 80) * 100);
    }

    //zero xml's third breakfast
    public int getMaintanBreakfastAmountZero3() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        return (int) ((maxCalorie / 88) * 100);
    }

    public int getMaintanLunchAmountZero3() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 139) * 100);
    }

    public int getMaintanDinnerAmountZero3() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 159) * 100);
    }

    //first xml's first breakfast
    public int getMaintanBreakfastAmountFirst1() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 104) * 100);
    }

    public int getMaintanLunchAmountFirst1() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 113) * 100);
    }

    public int getMaintanDinnerAmountFirst1() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 125) * 100);
    }

    //first xml's second breakfast
    public int getMaintanBreakfastAmountFirst2() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 162) * 100);
    }

    public int getMaintanLunchAmountFirst2() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 119) * 100);
    }

    public int getMaintanDinnerAmountFirst2() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 136) * 100);
    }

    //first xml's third breakfast
    public int getMaintanBreakfastAmountFirst3() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        return (int) ((maxCalorie / 166) * 100);
    }

    public int getMaintanLunchAmountFirst3() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 173) * 100);
    }

    public int getMaintanDinnerAmountFirst3() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 102) * 100);
    }


    //second xml's first breakfast
    public int getMaintanBreakfastAmountSecond1() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 203) * 100);
    }

    public int getMaintanLunchAmountSecond1() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 162) * 100);
    }

    public int getMaintanDinnerAmountSecond1() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 207) * 100);
    }

    //second xml's second breakfast
    public int getMaintanBreakfastAmountSecond2() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        //return (int) ((maxCalorie / foodMacro[0].getKcal()) * 100);
        return (int) ((maxCalorie / 160) * 100);
    }

    public int getMaintanLunchAmountSecond2() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 167) * 100);
    }

    public int getMaintanDinnerAmountSecond2() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 91) * 100);
    }

    //second xml's third breakfast
    public int getMaintanBreakfastAmountSecond3() {
        double maxCalorie = calcModel.maintenance() * 0.35;
        return (int) ((maxCalorie / 183) * 100);
    }

    public int getMaintanLunchAmountSecond3() {
        double maxCalorie = (calcModel.maintenance() * 0.35);
        /*return (int) ((maxCalorie / foodMacro[1].getKcal()) * 100);*/
        return (int) ((maxCalorie / 196) * 100);
    }

    public int getMaintanDinnerAmountSecond3() {
        double maxCalorie = (calcModel.maintenance() * 0.3);
        /*return (int) ((maxCalorie / foodMacro[2].getKcal()) * 100);*/
        return (int) ((maxCalorie / 111) * 100);
    }
}
