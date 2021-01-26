package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;

import com.szakdoga.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MenuOfferActivity extends FunctionsActivity{

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_offer_window);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView first = findViewById(R.id.first_meal_1);
        first.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView second = findViewById(R.id.second_meal_1);
        second.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView third = findViewById(R.id.third_meal_1);
        third.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView first2 = findViewById(R.id.first_meal_2);
        first2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView second2 = findViewById(R.id.second_meal_2);
        second2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView third2 = findViewById(R.id.third_meal_2);
        third2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView first3 = findViewById(R.id.first_meal_3);
        first3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView second3 = findViewById(R.id.second_meal_3);
        second3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView third3 = findViewById(R.id.third_meal_3);
        third3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });
    }


}
