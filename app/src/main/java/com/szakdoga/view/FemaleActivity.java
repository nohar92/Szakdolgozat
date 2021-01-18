package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class FemaleActivity extends GenderActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.female_window);

        Button femaleBack = findViewById(R.id.femaleBackButton);
        femaleBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), GenderActivity.class);
                startActivity(intent);

            }
        });
    }
}
