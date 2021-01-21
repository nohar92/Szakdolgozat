package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class CalculationsActivity extends FunctionsActivity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculations_window);

        // Create back button and its clickListener to step back FunctionsActivity
        Button resultBack = findViewById(R.id.back_to_functions);
        resultBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);

            }
        });
    }
}
