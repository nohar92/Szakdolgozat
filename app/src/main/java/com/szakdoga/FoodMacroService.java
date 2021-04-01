package com.szakdoga;

import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.szakdoga.model.FoodMacro;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class FoodMacroService {


    FoodMacro[] foodMacro;
    FoodMacro[] breakfast;
    FoodMacro[] lunch;
    FoodMacro[] dinner;


    public FoodMacroService() {
        try {
            getFoodDetails();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public FoodMacro[] getFoodMacro() {
        return foodMacro;
    }


    /**
     * Get foodDetails from database.
     * Using php script which create a json array from that data. Loop through it
     * and append it to a String object
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public void getFoodDetails() throws ExecutionException, InterruptedException {

        class GetJSON extends AsyncTask<Void, Void, Void> {

            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    URL url = new URL("https://uncloudy-refurbishm.000webhostapp.com/getMacro.php");
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json).append("\n");
                    }
                    loadData(sb.toString().trim());
                  //  loadFoodName(sb.toString().trim(),1);
                //    System.out.println("MacroService" + sb.toString().trim());
                } catch (Exception e) {

                }

                return null;
            }
        }
        GetJSON getJSON = new GetJSON();
        getJSON.execute().get();

    }

    private void loadFoodName(String json, int index) throws JSONException {

        JSONArray jsonArray = new JSONArray(json);
       // ArrayList<String> foodN = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(index);
            String foodName = obj.getString("foodname");

            Log.d("JSONArray", foodName);
        }
    }


    /**
     * Load data to foodMacro
     * @param json data from database getting by getFoodDetails() method
     * @throws JSONException
     */
    private void loadData(String json) throws JSONException {

        ObjectMapper objectMapper = new JsonMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            breakfast = objectMapper.readValue(json, FoodMacro[].class);
           /* lunch = objectMapper.readValue(json,FoodMacro[].class);
            dinner = objectMapper.readValue(json,FoodMacro[].class);*/
            foodMacro = objectMapper.readValue(json, FoodMacro[].class);

        } catch (JsonProcessingException e) {
            //Toast.makeText(getApplicationContext(), "JsonProcessingException: Can not process json string!", Toast.LENGTH_LONG).show();
        }
    }
}
