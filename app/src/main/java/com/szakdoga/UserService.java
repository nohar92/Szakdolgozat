package com.szakdoga;

import android.os.AsyncTask;
import android.widget.Toast;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.szakdoga.model.User;

import org.json.JSONException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class UserService {


    User user;

    public UserService() {
        try {
            getDetails();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public User getUser() { return user; }


    public void getDetails() throws ExecutionException, InterruptedException {

        class GetJSON extends AsyncTask<Void, Void, Void> {

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
                    loadData(sb.toString().trim());
                } catch (Exception e) {

                }

                return null;
            }
        }
        GetJSON getJSON = new GetJSON();
        getJSON.execute().get();

    }


    private void loadData(String json) throws JSONException {

        ObjectMapper objectMapper = new JsonMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            user = objectMapper.readValue(json, User.class);

        //    System.out.println("Adatok:" + user.getName() + user.getGender() + user.getHeight() + user.getWeight());
        } catch (JsonProcessingException e) {
            //Toast.makeText(getApplicationContext(), "JsonProcessingException: Can not process json string!", Toast.LENGTH_LONG).show();
        }
    }
}
