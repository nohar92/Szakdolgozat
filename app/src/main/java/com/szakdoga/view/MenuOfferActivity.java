package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class MenuOfferActivity extends FunctionsActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_offer_window);

        // Create back button and its clickListener to step back FunctionsActivity
        Button back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FunctionsActivity.class);
                startActivity(intent);

            }
        });
    }
}
