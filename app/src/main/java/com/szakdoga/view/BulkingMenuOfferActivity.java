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
import com.szakdoga.view.recipes.RecipeActivity;
import com.szakdoga.view.recipes.RecipeActivity10;
import com.szakdoga.view.recipes.RecipeActivity11;
import com.szakdoga.view.recipes.RecipeActivity12;
import com.szakdoga.view.recipes.RecipeActivity13;
import com.szakdoga.view.recipes.RecipeActivity14;
import com.szakdoga.view.recipes.RecipeActivity15;
import com.szakdoga.view.recipes.RecipeActivity16;
import com.szakdoga.view.recipes.RecipeActivity17;
import com.szakdoga.view.recipes.RecipeActivity18;
import com.szakdoga.view.recipes.RecipeActivity19;
import com.szakdoga.view.recipes.RecipeActivity2;
import com.szakdoga.view.recipes.RecipeActivity20;
import com.szakdoga.view.recipes.RecipeActivity21;
import com.szakdoga.view.recipes.RecipeActivity22;
import com.szakdoga.view.recipes.RecipeActivity23;
import com.szakdoga.view.recipes.RecipeActivity24;
import com.szakdoga.view.recipes.RecipeActivity25;
import com.szakdoga.view.recipes.RecipeActivity26;
import com.szakdoga.view.recipes.RecipeActivity27;
import com.szakdoga.view.recipes.RecipeActivity3;
import com.szakdoga.view.recipes.RecipeActivity4;
import com.szakdoga.view.recipes.RecipeActivity5;
import com.szakdoga.view.recipes.RecipeActivity6;
import com.szakdoga.view.recipes.RecipeActivity7;
import com.szakdoga.view.recipes.RecipeActivity8;
import com.szakdoga.view.recipes.RecipeActivity9;

import java.security.SecureRandom;

import de.hdodenhof.circleimageview.CircleImageView;

public class BulkingMenuOfferActivity extends FunctionsActivity {

    private final UserService userService = new UserService();
    private final FoodMacroService foodMacroService = new FoodMacroService();
    SecureRandom rand = new SecureRandom();
    /*// For Recyclerview
    private final String JSON_URL = "https://raw.githubusercontent.com/nohar92/Szoftverfejlesztes/master/BreakfastApi.json";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<FoodMacro> foodList;*/

    public int randCase = rand.nextInt(3);

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
        if (randCase == 0) {


            setContentView(R.layout.menu_offer_window);
            FoodModel foodModel = new FoodModel(foodMacroService.getFoodMacro(), new CalculationModel(userService.getUser()));

            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast1 = findViewById(R.id.breakfast_1);
            // breakfast1.setImageURI();
            breakfast1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity4.class);
                    startActivity(intent);
                }
            });


            TextView firstBreakfast = findViewById(R.id.first_breakfast);
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountZero1() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1);
            firstBreakfastName.setText("Meggyes zabkása");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity13.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountZero1() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1);
            firstLunchName.setText("Tonhal steak");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity22.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountZero1() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1);
            firstDinnerName.setText("Gyros tál");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity5.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountZero2() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2);
            secondBreakfastName.setText("Bubbles and squeak");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity14.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountZero2() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2);
            secondLunchName.setText("Zöldséges húsgolyó");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity23.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountZero2() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2);
            secondDinnerName.setText("Lecs-shuka");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity6.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountZero3() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3);
            thirdBreakfastName.setText("Zöldséges-darált hús");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity15.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountZero3() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3);
            thirdLunchName.setText("Szilvás gombóc");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity21.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountZero3() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3);
            thirdDinnerName.setText("Tejszínes csirkemell");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);
        } else if (randCase == 1) {
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
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountFirst1() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1_offer1);
            firstBreakfastName.setText("Mosolygós szemüveg");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1_offer1);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity10.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch_offer1);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountFirst1() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1_offer1);
            firstLunchName.setText("Paprikás mini 'pizza'");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1_offer1);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity19.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner_offer1);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountFirst1() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1_offer1);
            firstDinnerName.setText("Grillezett csirkemell");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2_offer1);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity2.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast_offer1);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountFirst2() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2_offer1);
            secondBreakfastName.setText("Gyümölcsrizs");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2_offer1);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity11.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch_offer1);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountFirst2() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2_offer1);
            secondLunchName.setText("Libacomb őszi ízekkel");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2_offer1);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity20.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner_offer1);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountFirst2() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2_offer1);
            secondDinnerName.setText("Brassói aprópecsenye");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3_offer1);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity3.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast_offer1);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountFirst3() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3_offer1);
            thirdBreakfastName.setText("Tükörtojás avokádóban");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3_offer1);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity12.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch_offer1);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountFirst3() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3_offer1);
            thirdLunchName.setText("Sajtos karajszeletek");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3_offer1);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity24.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner_offer1);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountFirst3() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3_offer1);
            thirdDinnerName.setText("Sonkás-mozzarellás saláta");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);

        } else if (randCase == 2) {
            setContentView(R.layout.menu_offer_window2);

            FoodModel foodModel = new FoodModel(foodMacroService.getFoodMacro(), new CalculationModel(userService.getUser()));

            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast1 = findViewById(R.id.breakfast_1_offer2);
            // breakfast1.setImageURI();
            breakfast1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity7.class);
                    startActivity(intent);
                }
            });


            TextView firstBreakfast = findViewById(R.id.first_breakfast_offer2);
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountSecond1() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1_offer2);
            firstBreakfastName.setText("Tojásos omlett");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1_offer2);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity16.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch_offer2);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountSecond1() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1_offer2);
            firstLunchName.setText("Baconös csibefalat");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1_offer2);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity25.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner_offer2);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountSecond1() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1_offer2);
            firstDinnerName.setText("Szilvás pulykamell");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2_offer2);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity8.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast_offer2);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountSecond2() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2_offer2);
            secondBreakfastName.setText("Low carb reggeli");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2_offer2);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity17.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch_offer2);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountSecond2() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2_offer2);
            secondLunchName.setText("Mexikói chilisbab");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2_offer2);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity26.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner_offer2);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountSecond2() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2_offer2);
            secondDinnerName.setText("Citromos csirkemell");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3_offer2);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity9.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast_offer2);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getBulkingBreakfastAmountSecond3() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3_offer2);
            thirdBreakfastName.setText("Amerikai palacsinta");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3_offer2);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity18.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch_offer2);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getBulkingLunchAmountSecond3() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3_offer2);
            thirdLunchName.setText("Parmezános csirke");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3_offer2);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity27.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner_offer2);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getBulkingDinnerAmountSecond3() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3_offer2);
            thirdDinnerName.setText("Céklás gnocchi");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
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


