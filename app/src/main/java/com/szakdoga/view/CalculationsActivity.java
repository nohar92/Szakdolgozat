package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.szakdoga.R;
import com.szakdoga.model.CalculationModel;
import com.szakdoga.model.User;

public class CalculationsActivity extends FunctionsActivity {

    private TextView bmi, bodyFat, bmr, bulkTdee, cutTdee, maintanTdee;
    private TextView bulkPro, cutPro, mainPro, bulkCarb, cutCarb, mainCarb, bulkFat, cutFat, mainFat;
    User user = new User();
    CalculationModel calcMod = new CalculationModel(user);


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculations_window);

        bmi = findViewById(R.id.bmi_value);
        bmi.setText(String.valueOf(CalculationModel.round(calcMod.bmi(), 2)));

        bodyFat = findViewById(R.id.bodyFat_value);
        bodyFat.setText(String.valueOf(CalculationModel.round(calcMod.bodyFat(), 2)));

        bmr = findViewById(R.id.bmr_value);
        bmr.setText(String.valueOf((int) calcMod.bmr()));

        bulkTdee = findViewById(R.id.bulk_tdee);
        bulkTdee.setText(String.valueOf((int) CalculationModel.round(calcMod.bulking(), 2)));

        cutTdee = findViewById(R.id.cut_tdee);
        cutTdee.setText(String.valueOf((int) CalculationModel.round(calcMod.cutting(), 2)));

        maintanTdee = findViewById(R.id.maintan_tdee);
        maintanTdee.setText(String.valueOf((int) CalculationModel.round(calcMod.maintenance(), 2)));

        bulkPro = findViewById(R.id.bulk_protein);
        bulkPro.setText(String.valueOf(CalculationModel.round(calcMod.getBulkPro(),2)));

        bulkCarb = findViewById(R.id.bulk_carb);
        bulkCarb.setText(String.valueOf(CalculationModel.round(calcMod.getBulkCarb(),2)));

        bulkFat = findViewById(R.id.bulk_fat);
        bulkFat.setText(String.valueOf(CalculationModel.round(calcMod.getBulkFat(),2)));

        cutPro = findViewById(R.id.cut_protein);
        cutPro.setText(String.valueOf(CalculationModel.round(calcMod.getCutPro(),2)));

        cutCarb = findViewById(R.id.cut_carb);
        cutCarb.setText(String.valueOf(CalculationModel.round(calcMod.getCutCarb(),2)));

        cutFat = findViewById(R.id.cut_fat);
        cutFat.setText(String.valueOf(CalculationModel.round(calcMod.getCutFat(),2)));

        mainPro = findViewById(R.id.maintan_protein);
        mainPro.setText(String.valueOf(CalculationModel.round(calcMod.getMainPro(),2)));

        mainCarb = findViewById(R.id.maintan_carb);
        mainCarb.setText(String.valueOf(CalculationModel.round(calcMod.getMainCarb(),2)));

        mainFat = findViewById(R.id.maintan_fat);
        mainFat.setText(String.valueOf(CalculationModel.round(calcMod.getMainFat(),2)));





        // Create back button and its clickListener to step back FunctionsActivity
        Button resultBack = findViewById(R.id.back_to_functions);
        resultBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);

            }
        });

        // Create bulking text and set its clickListener to step forward MenuOfferActivity
        TextView bulking = findViewById(R.id.bulking);
        bulking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MenuOfferActivity.class);
                startActivity(intent);
            }
        });

        // Create cutting text and set its clickListener to step forward MenuOfferActivity
        TextView cutting = findViewById(R.id.cutting);
        cutting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MenuOfferActivity.class);
                startActivity(intent);
            }
        });

        // Create keep text clickable and set its clickListener to step forward MenuOfferActivity
        TextView keep = findViewById(R.id.keep);
        keep.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MenuOfferActivity.class);
                startActivity(intent);
            }
        });
    }
}

