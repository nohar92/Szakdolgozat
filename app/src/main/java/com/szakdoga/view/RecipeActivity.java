package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class RecipeActivity extends MenuOfferActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window);

        // Create back button and its clickListener to step back to MenuOfferActivity
        Button back = findViewById(R.id.back_to_menu_offer);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), MenuOfferActivity.class);
                startActivity(intent);

            }
        });

    }
}
