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
        getJSON();

        /*try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView breakfast1 = findViewById(R.id.breakfast_1);
        breakfast1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView lunch1 = findViewById(R.id.lunch_1);
        lunch1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView dinner1 = findViewById(R.id.dinner_1);
        dinner1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView breakfast2 = findViewById(R.id.breakfast_2);
        breakfast2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView lunch2 = findViewById(R.id.lunch_2);
        lunch2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView dinner2 = findViewById(R.id.dinner_2);
        dinner2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView breakfast3 = findViewById(R.id.breakfast_3);
        breakfast3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView lunch3 = findViewById(R.id.lunch_3);
        lunch3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView dinner3 = findViewById(R.id.dinner_3);
        dinner3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);

            }
        });
    }

    private void getJSON() {
    }


}
