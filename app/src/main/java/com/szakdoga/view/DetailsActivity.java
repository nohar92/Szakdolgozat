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
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.szakdoga.R;

import java.util.HashMap;
import java.util.Map;

public class DetailsActivity extends MainActivity {
    //implements AdapterView.OnItemSelectedListener {

    EditText txtName, txtGender, txtAge,txtWeight,txtHeight,txtNeck,txtWaist,txtHip,txtActivityLv;
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

        // Create save button and its clickListener to save datas and step forward to FunctionsActivity
        saveAndForward = findViewById(R.id.save_button);
        saveAndForward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
/*
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
                } else if(TextUtils.isEmpty(gender)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(age)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(weight)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(height)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(neck)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(waist)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(hip)) {
                    alertDialog();
                } else if(TextUtils.isEmpty(activityLv)) {
                    alertDialog();
                } else {
                    insertData();
                    Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                    startActivity(intent);
                }
*/
                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);
            }
        });
        /*
        // Create an ArrayAdapter using the string array and a default spinner layout
        // Specify the layout to use when the list of choices appears
        // Apply the adapter to the spinner

        Spinner activitySpinner = (Spinner) findViewById(R.id.activitySpinner);
        ArrayAdapter<CharSequence> activityAdapter = ArrayAdapter.createFromResource(
                this, R.array.activity_levels, android.R.layout.simple_spinner_item);
        activityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activitySpinner.setAdapter(activityAdapter);
        //   spinner.setOnItemSelectedListener(this);
        */

        /*
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    */
    }

    private void alertDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Töltse ki a mezőt/mezőket!");
        dialog.setTitle("Tip");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

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


        if (name.isEmpty()) {
            Toast.makeText(this, "Enter your name", Toast.LENGTH_LONG).show();
        } else if (gender.isEmpty()) {
            Toast.makeText(this, "Enter your gender", Toast.LENGTH_LONG).show();
        } else if (age.isEmpty()) {
            Toast.makeText(this, "Enter your age", Toast.LENGTH_LONG).show();
        } else if (weight.isEmpty()) {
            Toast.makeText(this, "Enter your weight", Toast.LENGTH_LONG).show();
        } else if (height.isEmpty()) {
            Toast.makeText(this, "Enter your height", Toast.LENGTH_LONG).show();
        } else if (neck.isEmpty()) {
            Toast.makeText(this, "Enter your neck circumference", Toast.LENGTH_LONG).show();
        } else if (waist.isEmpty()) {
            Toast.makeText(this, "Enter your waist circumference", Toast.LENGTH_LONG).show();
        } else if (hip.isEmpty()) {
            Toast.makeText(this, "Enter your hip circumference", Toast.LENGTH_LONG).show();
        } else if (activityLv.isEmpty()) {
            Toast.makeText(this, "Enter your activity level", Toast.LENGTH_LONG).show();
        } else {


            StringRequest request = new StringRequest(Request.Method.POST,"https://uncloudy-refurbishm.000webhostapp.com/insert.php",
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (response.equalsIgnoreCase("Data Inserted")) {
                                Toast.makeText(DetailsActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
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
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> params = new HashMap<String, String>();
                    params.put("username", name);
                    params.put("gender", gender);
                    params.put("age", age);
                    params.put("weight", weight);
                    params.put("height", height);
                    params.put("neck", neck);
                    params.put("waist", waist);
                    params.put("hip", hip);
                    params.put("activity_level",activityLv);

                    return params;
                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(DetailsActivity.this);
            requestQueue.add(request);
        }
    }
}
