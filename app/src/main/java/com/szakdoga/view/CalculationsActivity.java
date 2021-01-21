package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        // Create bulking text and set its clickListener to step forward MenuOfferActivity
        TextView bulking = findViewById(R.id.bulking);
        bulking.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(),MenuOfferActivity.class);
                startActivity(intent);
            }

        });

        // Create cutting text and set its clickListener to step forward MenuOfferActivity
        TextView cutting = findViewById(R.id.cutting);
        cutting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(),MenuOfferActivity.class);
                startActivity(intent);
            }

        });

        // Create keep text clickable and set its clickListener to step forward MenuOfferActivity
        TextView keep = findViewById(R.id.keep);
        keep.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(),MenuOfferActivity.class);
                startActivity(intent);
            }

        });
    }
}
