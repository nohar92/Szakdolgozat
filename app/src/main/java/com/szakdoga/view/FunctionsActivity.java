package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.szakdoga.R;

public class FunctionsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.functions_window);

        // Create a menu button and its clickListener to step forward MenuOfferActivity
        Button menuOffer = findViewById(R.id.menuOfferButton);
        menuOffer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), MenuOfferActivity.class);
                startActivity(intent);

            }
        });

        // Create calculation button and its clickListener to step forward CalculationsActivity
        Button calculation = findViewById(R.id.calculationsButton);
        calculation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), CalculationsActivity.class);
                startActivity(intent);

            }
        });



        // Create changeDetails button and its clickListener to step forward ChangeDetailsActivity
        Button changeDetails = findViewById(R.id.changeDetailsButton);
        changeDetails.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), ChangeDetailsActivity.class);
                startActivity(intent);

            }
        });
}

}
