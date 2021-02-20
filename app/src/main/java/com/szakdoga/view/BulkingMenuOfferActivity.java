package com.szakdoga.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;

import com.szakdoga.FoodMacroService;
import com.szakdoga.R;
import com.szakdoga.UserService;
import com.szakdoga.model.CalculationModel;
import com.szakdoga.model.FoodModel;

import de.hdodenhof.circleimageview.CircleImageView;

public class BulkingMenuOfferActivity extends FunctionsActivity {

    private final UserService userService = new UserService();
    private final FoodMacroService foodMacroService = new FoodMacroService();

    /*// For Recyclerview
    private final String JSON_URL = "https://raw.githubusercontent.com/nohar92/Szoftverfejlesztes/master/BreakfastApi.json";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<FoodMacro> foodList;*/

    public int CASE = 1;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (CASE == 1) {
            setContentView(R.layout.menu_offer_window1);

            FoodModel foodModel = new FoodModel(foodMacroService.getFoodMacro(), new CalculationModel(userService.getUser()));


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast1 = findViewById(R.id.breakfast_1_offer1);
            // breakfast1.setImageURI();
            breakfast1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });


            TextView firstBreakfast = findViewById(R.id.first_breakfast_offer1);
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmount() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1_offer1);
            firstBreakfastName.setText("Mosolygós szemüveg");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1_offer1);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch_offer1);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmount() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1_offer1);
            firstLunchName.setText("Paprikás mini 'pizza'");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1_offer1);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner_offer1);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmount() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1_offer1);
            firstDinnerName.setText("Grillezett csirkemell");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2_offer1);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast_offer1);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmount() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2_offer1);
            secondBreakfastName.setText("Gyümölcsrizs");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2_offer1);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch_offer1);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmount() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2_offer1);
            secondLunchName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2_offer1);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner_offer1);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmount() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2_offer1);
            secondDinnerName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3_offer1);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast_offer1);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmount() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3_offer1);
            thirdBreakfastName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3_offer1);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch_offer1);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmount() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3_offer1);
            thirdLunchName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3_offer1);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner_offer1);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmount() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3_offer1);
            thirdDinnerName.setText("FoodMacroService");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
        else {


            setContentView(R.layout.menu_offer_window);
            FoodModel foodModel = new FoodModel(foodMacroService.getFoodMacro(), new CalculationModel(userService.getUser()));

            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast1 = findViewById(R.id.breakfast_1);
            // breakfast1.setImageURI();
            breakfast1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });


            TextView firstBreakfast = findViewById(R.id.first_breakfast);
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmount() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1);
            firstBreakfastName.setText("Mosolygós szemüveg");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmount() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1);
            firstLunchName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmount() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1);
            firstDinnerName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmount() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2);
            secondBreakfastName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmount() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2);
            secondLunchName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmount() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2);
            secondDinnerName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmount() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3);
            thirdBreakfastName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmount() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3);
            thirdLunchName.setText("FoodMacroService");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmount() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3);
            thirdDinnerName.setText("FoodMacroService");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

/*    private void jsonrequest() {

        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject  = null ;

                for (int i = 0 ; i < response.length(); i++ ) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        FoodMacro foodMacro = new FoodMacro();
                        foodMacro.setFoodName(jsonObject.getString("foodname"));

                        foodMacro.setImage(jsonObject.getString("image"));
                        foodList.add(foodMacro);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                setuprecyclerview(foodList);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {}
        });

        requestQueue = Volley.newRequestQueue(BulkingMenuOfferActivity.this);
        requestQueue.add(request) ;
    }

    private void setuprecyclerview(List<FoodMacro> lastAnime) {

        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this,lastAnime) ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);
    }*/

}
