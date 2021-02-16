package com.szakdoga.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculationModel {

    User user;

    public CalculationModel(User user) {
        this.user = user;
    }


    public double bmi() {
        return (user.getWeight() / Math.pow(user.getHeight(), 2)) * 10000;
    }


    public double bodyFat() {
        if (user.getGender().equals("férfi")) {
            return (495 / (1.0324 - (0.19077 * (Math.log10(user.getWaist() - user.getNeck()))) + (0.15456 * (Math.log10(user.getHeight()))))) - 450;
        } else {
            return (495 / (1.29579 - (0.35004 * (Math.log10(user.getWaist() + user.getHip() - user.getNeck()))) + (0.221 * (Math.log10(user.getHeight()))))) - 450;
        }
    }


    public double bmr() {
        if (user.getGender().equals("férfi")) {
            return (10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() + 5);
        } else {
            return (10 * user.getWeight() + 6.25 * user.getHeight() - 5 * user.getAge() - 161);
        }
    }


    public double totalEnergy() {
        double result = bmr();

        switch (user.getActivityLv()) {
            case 1:
                return result * 1.2;
            case 2:
                return result * 1.375;
            case 3:
                return result * 1.55;
            case 4:
                return result * 1.725;
            case 5:
                return result * 1.9;
        }
        return 0;
    }

    public double bulking() {
        return totalEnergy() + 455;
    }

    public double getBulkPro() {
        return (bulking() * 0.25 / 4);
    }

    public double getBulkCarb() {
        return (bulking() * 0.55 / 4);
    }

    public double getBulkFat() {
        return (bulking() * 0.2 / 9);
    }

    public double maintenance() {
        return totalEnergy();
    }

    public double getMainPro() {
        return (maintenance() * 0.2 / 4);
    }

    public double getMainCarb() {
        return (maintenance() * 0.5 / 4);
    }

    public double getMainFat() {
        return (maintenance() * 0.3 / 9);
    }

    public double cutting() {
        return totalEnergy() - 355;
    }

    public double getCutPro() {
        return (cutting() * 0.3 / 4);
    }

    public double getCutCarb() {
        return (cutting() * 0.45 / 4);
    }

    public double getCutFat() {
        return (cutting() * 0.25 / 9);
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }


}
