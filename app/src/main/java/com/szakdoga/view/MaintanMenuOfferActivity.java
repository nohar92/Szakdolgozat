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

import de.hdodenhof.circleimageview.CircleImageView;

public class MaintanMenuOfferActivity extends FunctionsActivity {

    private final UserService userService = new UserService();
    private final FoodMacroService foodMacroService = new FoodMacroService();

    FoodMacro foodMacro = new FoodMacro();

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

        FoodModel foodModel = new FoodModel(foodMacro, new CalculationModel(userService.getUser()));

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
        firstBreakfastName.setText(FoodMacroService.class.getName());
        System.out.println("miért null" + foodMacro.getFoodName());


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
    }

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
