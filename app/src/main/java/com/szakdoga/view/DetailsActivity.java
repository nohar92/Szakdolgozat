package com.szakdoga.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.szakdoga.MySingleton;
import com.szakdoga.R;

import java.util.HashMap;
import java.util.Map;

public class DetailsActivity extends MainActivity {

    EditText txtName, txtGender, txtAge, txtWeight, txtHeight, txtNeck, txtWaist, txtHip, txtActivityLv;
    Button saveAndForward;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_window);

        txtName = findViewById(R.id.u_name);
        txtGender = findViewById(R.id.gender);
        txtAge = findViewById(R.id.age);
        txtWeight = findViewById(R.id.weight);
        txtHeight = findViewById(R.id.height);
        txtNeck = findViewById(R.id.neck);
        txtWaist = findViewById(R.id.waist);
        txtHip = findViewById(R.id.hip);
        txtActivityLv = findViewById(R.id.activity_level);

        /*
         * Create save button and its clickListener to insert datas to database and step forward to FunctionsActivity
         */

        saveAndForward = findViewById(R.id.save_button);
        saveAndForward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String name = txtName.getText().toString().trim();
                String gender = txtGender.getText().toString().trim();
                String age = txtAge.getText().toString().trim();
                String weight = txtWeight.getText().toString().trim();
                String height = txtHeight.getText().toString().trim();
                String neck = txtNeck.getText().toString().trim();
                String waist = txtWaist.getText().toString().trim();
                String hip = txtHip.getText().toString().trim();
                String activityLv = txtActivityLv.getText().toString().trim();


                if (TextUtils.isEmpty(name)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(gender)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(age)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(weight)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(height)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(neck)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(waist)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(hip)) {
                    alertDialog();
                } else if (TextUtils.isEmpty(activityLv)) {
                    alertDialog();
                } else {
                    insertData();
                    Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    /**
     * Create and show an alert window if user did not fill all the fields
     */
    private void alertDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Töltse ki az üresen hagyott mezőt/mezőket!");
        dialog.setTitle("Hiányzó adatok");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

    /**
     * Insert data to database with stringRequest via php script
     */
    public void insertData() {

        String name = txtName.getText().toString().trim();
        String gender = txtGender.getText().toString().trim();
        String age = txtAge.getText().toString().trim();
        String weight = txtWeight.getText().toString().trim();
        String height = txtHeight.getText().toString().trim();
        String neck = txtNeck.getText().toString().trim();
        String waist = txtWaist.getText().toString().trim();
        String hip = txtHip.getText().toString().trim();
        String activityLv = txtActivityLv.getText().toString().trim();

        StringRequest request = new StringRequest(Request.Method.POST, "https://uncloudy-refurbishm.000webhostapp.com/insert.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.equalsIgnoreCase("Data Inserted")) {
                            Toast.makeText(DetailsActivity.this, "Adatok feltöltve", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(DetailsActivity.this, response, Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(DetailsActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
        ) {

            /**
             * @return A Map of parameters to be used for a POST or PUT request.
             */
            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<>();
                params.put("username", name);
                params.put("gender", gender);
                params.put("age", age);
                params.put("weight", weight);
                params.put("height", height);
                params.put("neck", neck);
                params.put("waist", waist);
                params.put("hip", hip);
                params.put("activity_level", activityLv);

                return params;
            }
        };

        MySingleton.getInstance(this).addToRequestQueue(request);

    }

}

