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
import com.szakdoga.model.FoodMacro;
import com.szakdoga.model.FoodModel;

import java.security.SecureRandom;

import de.hdodenhof.circleimageview.CircleImageView;

public class MaintanMenuOfferActivity extends FunctionsActivity {

    private final UserService userService = new UserService();
    private final FoodMacroService foodMacroService = new FoodMacroService();
    SecureRandom rand = new SecureRandom();
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
        setContentView(R.layout.menu_offer_window);
        if (randCase == 0) {


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
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountZero1() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1);
            firstBreakfastName.setText("Meggyes zabkása");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountZero1() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1);
            firstLunchName.setText("Tonhal steak");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountZero1() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1);
            firstDinnerName.setText("Gyros tál");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountZero2() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2);
            secondBreakfastName.setText("Bubbles and squeak");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountZero2() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2);
            secondLunchName.setText("Zöldséges húsgolyó");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountZero2() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2);
            secondDinnerName.setText("Lecs-shuka");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountZero3() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3);
            thirdBreakfastName.setText("Zöldséges-darált hús");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountZero3() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3);
            thirdLunchName.setText("Szilvás gombóc");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountZero3() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3);
            thirdDinnerName.setText("Tejszínes csirkemell");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        else if (randCase == 1) {
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
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountFirst1() + " g");

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
            firstLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountFirst1() + " g");

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
            firstDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountFirst1() + " g");

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
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountFirst2() + " g");

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
            secondLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountFirst2() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2_offer1);
            secondLunchName.setText("Libacomb őszi ízekkel");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2_offer1);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner_offer1);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountFirst2() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2_offer1);
            secondDinnerName.setText("Brassói aprópecsenye");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3_offer1);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast_offer1);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountFirst3() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3_offer1);
            thirdBreakfastName.setText("Tükörtojás avokádóban");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3_offer1);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch_offer1);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountFirst3() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3_offer1);
            thirdLunchName.setText("Sajtos karajszeletek");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3_offer1);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner_offer1);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountFirst3() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3_offer1);
            thirdDinnerName.setText("Sonkás-mozzarellás saláta");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
        else if (randCase == 2) {
            setContentView(R.layout.menu_offer_window2);

            FoodModel foodModel = new FoodModel(foodMacroService.getFoodMacro(), new CalculationModel(userService.getUser()));

            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast1 = findViewById(R.id.breakfast_1_offer2);
            // breakfast1.setImageURI();
            breakfast1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });


            TextView firstBreakfast = findViewById(R.id.first_breakfast_offer2);
            firstBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountSecond1() + " g");

            TextView firstBreakfastName = findViewById(R.id.breakfast_name_1_offer2);
            firstBreakfastName.setText("Tojásos omlett");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch1 = findViewById(R.id.lunch_1_offer2);
            lunch1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstLunch = findViewById(R.id.firs_lunch_offer2);
            firstLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountSecond1() + " g");

            TextView firstLunchName = findViewById(R.id.lunch_name_1_offer2);
            firstLunchName.setText("Baconös csibefalat");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner1 = findViewById(R.id.dinner_1_offer2);
            dinner1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView firstDinner = findViewById(R.id.first_dinner_offer2);
            firstDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountSecond1() + " g");

            TextView firstDinnerName = findViewById(R.id.dinner_name_1_offer2);
            firstDinnerName.setText("Szilvás pulykamell");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast2 = findViewById(R.id.breakfast_2_offer2);
            breakfast2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondBreakfast = findViewById(R.id.second_breakfast_offer2);
            secondBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountSecond2() + " g");

            TextView secondBreakfastName = findViewById(R.id.breakfast_name_2_offer2);
            secondBreakfastName.setText("Low carb reggeli");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch2 = findViewById(R.id.lunch_2_offer2);
            lunch2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondLunch = findViewById(R.id.second_lunch_offer2);
            secondLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountSecond2() + " g");

            TextView secondLunchName = findViewById(R.id.lunch_name_2_offer2);
            secondLunchName.setText("Mexikói chilisbab");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner2 = findViewById(R.id.dinner_2_offer2);
            dinner2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView secondDinner = findViewById(R.id.second_dinner_offer2);
            secondDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountSecond2() + " g");

            TextView secondDinnerName = findViewById(R.id.dinner_name_2_offer2);
            secondDinnerName.setText("Citromos csirkemell");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView breakfast3 = findViewById(R.id.breakfast_3_offer2);
            breakfast3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdBreakfast = findViewById(R.id.third_breakfast_offer2);
            thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmountSecond3() + " g");

            TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3_offer2);
            thirdBreakfastName.setText("Amerikai palacsinta");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView lunch3 = findViewById(R.id.lunch_3_offer2);
            lunch3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdLunch = findViewById(R.id.third_lunch_offer2);
            thirdLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmountSecond3() + " g");

            TextView thirdLunchName = findViewById(R.id.lunch_name_3_offer2);
            thirdLunchName.setText("Parmezános csirke");


            // Create button and its clickListener to step forward RecipeActivity
            CircleImageView dinner3 = findViewById(R.id.dinner_3_offer2);
            dinner3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                    startActivity(intent);
                }
            });

            TextView thirdDinner = findViewById(R.id.third_dinner_offer2);
            thirdDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmountSecond3() + " g");

            TextView thirdDinnerName = findViewById(R.id.dinner_name_3_offer2);
            thirdDinnerName.setText("Céklás gnocchi");


            // calling the action bar
            ActionBar actionBar = getSupportActionBar();

            // showing the back button in action bar
            assert actionBar != null;
            actionBar.setDisplayHomeAsUpEnabled(true);

        }



        /*FoodModel foodModel = new FoodModel(foodMacroService.getFoodMacro(), new CalculationModel(userService.getUser()));

        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView breakfast1 = findViewById(R.id.breakfast_1);
        breakfast1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView firstBreakfast = findViewById(R.id.first_breakfast);
        firstBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmount() + " g");

        TextView firstBreakfastName = findViewById(R.id.breakfast_name_1);
        firstBreakfastName.setText("kakaós csiga");


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView lunch1 = findViewById(R.id.lunch_1);
        lunch1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView firstLunch = findViewById(R.id.firs_lunch);
        firstLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmount() + " g");

        TextView firstLunchName = findViewById(R.id.lunch_name_1);
        firstLunchName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView dinner1 = findViewById(R.id.dinner_1);
        dinner1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView firstDinner = findViewById(R.id.first_dinner);
        firstDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmount() + " g");

        TextView firstDinnerName = findViewById(R.id.dinner_name_1);
        firstDinnerName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView breakfast2 = findViewById(R.id.breakfast_2);
        breakfast2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView secondBreakfast = findViewById(R.id.second_breakfast);
        secondBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmount() + " g");

        TextView secondBreakfastName = findViewById(R.id.breakfast_name_2);
        secondBreakfastName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView lunch2 = findViewById(R.id.lunch_2);
        lunch2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView secondLunch = findViewById(R.id.second_lunch);
        secondLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmount() + " g");

        TextView secondLunchName = findViewById(R.id.lunch_name_2);
        secondLunchName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView dinner2 = findViewById(R.id.dinner_2);
        dinner2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView secondDinner = findViewById(R.id.second_dinner);
        secondDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmount() + " g");

        TextView secondDinnerName = findViewById(R.id.dinner_name_2);
        secondDinnerName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView breakfast3 = findViewById(R.id.breakfast_3);
        breakfast3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView thirdBreakfast = findViewById(R.id.third_breakfast);
        thirdBreakfast.setText("Mennyiség: " + " " + foodModel.getMaintanBreakfastAmount() + " g");

        TextView thirdBreakfastName = findViewById(R.id.breakfast_name_3);
        thirdBreakfastName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView lunch3 = findViewById(R.id.lunch_3);
        lunch3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView thirdLunch = findViewById(R.id.third_lunch);
        thirdLunch.setText("Mennyiség: " + " " + foodModel.getMaintanLunchAmount() + " g");

        TextView thirdLunchName = findViewById(R.id.lunch_name_3);
        thirdLunchName.setText(FoodMacroService.class.getName());


        // Create button and its clickListener to step forward RecipeActivity
        CircleImageView dinner3 = findViewById(R.id.dinner_3);
        dinner3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecipeActivity.class);
                startActivity(intent);
            }
        });

        TextView thirdDinner = findViewById(R.id.third_dinner);
        thirdDinner.setText("Mennyiség: " + " " + foodModel.getMaintanDinnerAmount() + " g");

        TextView thirdDinnerName = findViewById(R.id.dinner_name_3);
        thirdDinnerName.setText(FoodMacroService.class.getName());

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
    }*/

    /*private void getJSON() throws ExecutionException, InterruptedException {

        class GetJSON extends AsyncTask<Void, Void, Void> {


            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    URL url = new URL("https://uncloudy-refurbishm.000webhostapp.com/getMacro.php");
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json).append("\n");
                    }
                    System.out.println("eljut ide" + sb.toString().trim());
                    loadData(sb.toString().trim());

                } catch (Exception ignored) {

                }

                return null;
            }
        }
        GetJSON getJSON = new GetJSON();
        getJSON.execute().get();
    }
    private void loadData(String json) throws JSONException {

        ObjectMapper objectMapper = new JsonMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        try {
            FoodMacroList food = objectMapper.readValue(json, FoodMacroList.class);
            System.out.println(food + "KOLBÁSZ");
            System.out.println("Kaja adatok"+ foodMacro.getKcal());
            //System.out.println("Adatok:" + user.getName() + user.getGender() + user.getHeight() + "\n" + user.getWeight());
        } catch (JsonProcessingException e) {
            Toast.makeText(getApplicationContext(), "JsonProcessingException: Can not process json string!", Toast.LENGTH_LONG).show();
        }

    }*/
    }
}
