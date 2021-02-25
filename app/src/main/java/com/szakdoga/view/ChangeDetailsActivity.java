package com.szakdoga.view;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.szakdoga.MySingleton;
import com.szakdoga.R;

import java.util.HashMap;
import java.util.Map;

public class ChangeDetailsActivity extends FunctionsActivity {


    EditText txtName, txtGender, txtAge, txtWeight, txtHeight, txtNeck, txtWaist, txtHip, txtActivityLv;
    Button back, saveAndBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_details_window);

        txtName = findViewById(R.id.u_name_ch);
        txtGender = findViewById(R.id.gender_ch);
        txtAge = findViewById(R.id.age_ch);
        txtWeight = findViewById(R.id.weight_ch);
        txtHeight = findViewById(R.id.height_ch);
        txtNeck = findViewById(R.id.neck_ch);
        txtWaist = findViewById(R.id.waist_ch);
        txtHip = findViewById(R.id.hip_ch);
        txtActivityLv = findViewById(R.id.activity_level_ch);


        /*
         * Create back button and its clickListener to step back to FunctionsActivity
         */

        back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);

            }
        });

        /*
         * Create saveAndBack button and its clickListener to update data and step back to FunctionsActivity
         */

        saveAndBack = findViewById(R.id.saveAndBackButton);
        saveAndBack.setOnClickListener(new View.OnClickListener() {
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

                    updateData();
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
     * Update user details to database with stringRequest via php script
     */
    public void updateData() {

        String id = "1";
        String name = txtName.getText().toString();
        String gender = txtGender.getText().toString();
        String age = txtAge.getText().toString();
        String weight = txtWeight.getText().toString();
        String height = txtHeight.getText().toString();
        String neck = txtNeck.getText().toString();
        String waist = txtWaist.getText().toString();
        String hip = txtHip.getText().toString();
        String activityLv = txtActivityLv.getText().toString();

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Updating...");
        progressDialog.show();

        StringRequest request = new StringRequest(Request.Method.POST, "https://uncloudy-refurbishm.000webhostapp.com/update.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.equalsIgnoreCase("Data Updated")) {
                            Toast.makeText(ChangeDetailsActivity.this, "Adatok frissítve", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(ChangeDetailsActivity.this, response, Toast.LENGTH_LONG).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ChangeDetailsActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();

            }
        }) {

            /**
             * @return A Map of parameters to be used for a POST or PUT request.
             */
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new HashMap<String, String>();
                params.put("id", id);
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
       /* RequestQueue queue = MySingleton.getInstance(this.getApplicationContext()).
                getRequestQueue();*/

        MySingleton.getInstance(this).addToRequestQueue(request);
    }

  /*  public  void readData() {

        String  name;
        String gender = txtGender.getText().toString();
        String age = txtAge.getText().toString();
        String weight = txtWeight.getText().toString();
        String height = txtHeight.getText().toString();
        String neck = txtNeck.getText().toString();
        String waist = txtWaist.getText().toString();
        String hip = txtHip.getText().toString();
        String activityLv = txtActivityLv.getText().toString();

        StringRequest request = new StringRequest("https://uncloudy-refurbishm.000webhostapp.com/read.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        *if (response.equalsIgnoreCase("Data Readed")) {
                            Toast.makeText(ChangeDetailsActivity.this, "Data Readed", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(ChangeDetailsActivity.this, response, Toast.LENGTH_LONG).show();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ChangeDetailsActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
        ) {
            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<String, String>();
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

    }*/
}