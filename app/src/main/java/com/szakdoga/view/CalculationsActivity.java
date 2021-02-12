package com.szakdoga.view;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.szakdoga.R;
import com.szakdoga.model.CalculationModel;
import com.szakdoga.model.User;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CalculationsActivity extends FunctionsActivity {

    private TextView bmi, bodyFat, bmr, bulkTdee, cutTdee, maintanTdee;
    private TextView bulkPro, cutPro, mainPro, bulkCarb, cutCarb, mainCarb, bulkFat, cutFat, mainFat;

    User user = new User();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculations_window);
        getJSON();

        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //System.out.println(user.getGender());
        CalculationModel calcMod = new CalculationModel(user);

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

    private void getJSON() {

        class GetJSON extends AsyncTask<Void, Void, Void> {

/*
            @Override
            protected void onPreExecute(String s) {
                super.onPreExecute(s);
                try {
                    loadData(s);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }


            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //   Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();

            }
*/

            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    URL url = new URL("https://uncloudy-refurbishm.000webhostapp.com/getUserDetails.php");
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json).append("\n");
                    }
                    System.out.println(sb.toString().trim());
                    loadData(sb.toString().trim());
                    //return sb.toString().trim();
                } catch (Exception e) {
                 //   return null;
                }

                return null;
            }
        }
        GetJSON getJSON = new GetJSON();
        getJSON.execute();
    }



    private void loadData(String json) throws JSONException{

        ObjectMapper objectMapper = new JsonMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        try {
            user = objectMapper.readValue(json, User.class);

            //System.out.println("Adatok:" + user.getName() + user.getGender() + user.getHeight() + "\n" + user.getWeight());
        } catch (JsonProcessingException e) {
            Toast.makeText(getApplicationContext(), "JsonProcessingException: Can not process json string!", Toast.LENGTH_LONG).show();
        }
    }




}

