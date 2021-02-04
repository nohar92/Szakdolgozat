package com.szakdoga.view;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
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

public class ChangeDetailsActivity extends FunctionsActivity{
            //implements AdapterView.OnItemSelectedListener {

    EditText txtId, txtName, txtGender, txtAge,txtWeight,txtHeight,txtNeck,txtWaist,txtHip,txtActivityLv;
    Button back,saveAndBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_details_window);

        txtId = findViewById(R.id.Id_ch);
        txtName = findViewById(R.id.u_name_ch);
        txtGender = findViewById(R.id.gender_ch);
        txtAge = findViewById(R.id.age_ch);
        txtWeight = findViewById(R.id.weight_ch);
        txtHeight = findViewById(R.id.height_ch);
        txtNeck = findViewById(R.id.neck_ch);
        txtWaist = findViewById(R.id.waist_ch);
        txtHip = findViewById(R.id.hip_ch);
        txtActivityLv = findViewById(R.id.activity_level_ch);



        // Create back button and its clickListener to step back to FunctionsActivity
        back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);

            }
        });

        // Create saveAndBack button and its clickListener to save datas and step back to FunctionsActivity
        saveAndBack = findViewById(R.id.saveAndBackButton);
        saveAndBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                updateData();
                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);

            }
        });

        /*
        // Create an ArrayAdapter using the string array and a default spinner layout
        // Specify the layout to use when the list of choices appears
        // Apply the adapter to the spinner

        Spinner spinner = (Spinner) findViewById(R.id.activitySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.activity_levels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //   spinner.setOnItemSelectedListener(this);
        */
    }
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

     public void updateData(){

         String id = txtId.getText().toString();
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
                                Toast.makeText(ChangeDetailsActivity.this, "Data Updated", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(ChangeDetailsActivity.this, response, Toast.LENGTH_LONG).show();
                            }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ChangeDetailsActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();

            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> params = new HashMap<String, String>();
                params.put("id",id);
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

        RequestQueue requestQueue = Volley.newRequestQueue(ChangeDetailsActivity.this);
        requestQueue.add(request);
    }


}