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

    private  void loadFoodName(String json, int index) throws JSONException {

        JSONArray jsonArray = new JSONArray(json);
       // ArrayList<String> foodN = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(index);
            String foodName = obj.getString("foodname");

            Log.d("JSONArray", foodName);
        }
    }


    private void loadData(String json) throws JSONException {

        ObjectMapper objectMapper = new JsonMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            breakfast = objectMapper.readValue(json, FoodMacro[].class);
           /* lunch = objectMapper.readValue(json,FoodMacro[].class);
            dinner = objectMapper.readValue(json,FoodMacro[].class);*/

            foodMacro = objectMapper.readValue(json, FoodMacro[].class);
           /* System.out.println("break" + breakfast.length);
            System.out.println("lunch" + lunch.length);
            System.out.println("dinner" + dinner.length);
            System.out.println("foodMacro" + foodMacro.length);
*/

            /*for (FoodMacro breakF : breakfast) {
                System.out.println("food:" + breakF.getFoodName() + " " + breakF.getKcal() + " " + breakF.getCarbohydrate() + " " + breakF.getId());
            }*/

            //  System.out.println("food:" + breakfast[0].getImage() + "\n" + breakfast[0].getFoodName() + breakfast[1].getKcal() +"szar az egész"  + breakfast[1].getCarbohydrate() + "csak a lokálisat adja vissza" + breakfast[1].getId());
           /* System.out.println("food:" + lunch[27].getKcal() +"szar az egész"  + lunch[27].getCarbohydrate() + "csak a lokálisat adja vissza" + lunch[27].getId());
            System.out.println("food:" + dinner[28].getKcal() +"szar az egész"  + dinner[28].getCarbohydrate() + "csak a lokálisat adja vissza" + dinner[28].getId());
            System.out.println("food:" + foodMacro[29].getKcal() +"szar az egész"  + foodMacro[29].getCarbohydrate() + "csak a lokálisat adja vissza" + foodMacro[29].getId());*/
        } catch (JsonProcessingException e) {
            //Toast.makeText(getApplicationContext(), "JsonProcessingException: Can not process json string!", Toast.LENGTH_LONG).show();
        }
    }
}
