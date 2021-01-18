package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class MaleActivity extends GenderActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.male_window);

        Button maleBack = findViewById(R.id.maleBackButton);
        maleBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), GenderActivity.class);
                startActivity(intent);

            }
        });

    }
}
