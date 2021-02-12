package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.szakdoga.R;

public class MainActivity extends AppCompatActivity {


    private final String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        Button calculate = findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isDataBaseEmpty()) {
                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                    startActivity(intent);
                }
            }
        });
    }


    public boolean isDataBaseEmpty() {

        StringRequest request = new StringRequest(Request.Method.POST, "https://uncloudy-refurbishm.000webhostapp.com/isDatabaseEmpty.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.length() > 0) {

                            //    Toast.makeText(MainActivity.this, response, Toast.LENGTH_LONG).show();
                        } else {

                            // Toast.makeText(MainActivity.this, response + "Üres ez most", Toast.LENGTH_LONG).show();
                        }
                    }
                }, error -> Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_LONG).show()) {


        };

        // RequestQueue queue = MySingleton.getInstance(this.getApplicationContext()).getRequestQueue();
        MySingleton.getInstance(this).addToRequestQueue(request);


        return false;
    }


}