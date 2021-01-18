package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class GenderActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender_window);


        Button male = findViewById(R.id.maleButton);
        male.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), MaleActivity.class);
                startActivity(intent);
            }
        });

        Button female = findViewById(R.id.femaleButton);
        male.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), FemaleActivity.class);
                startActivity(intent);

            }
        });
    }
}
