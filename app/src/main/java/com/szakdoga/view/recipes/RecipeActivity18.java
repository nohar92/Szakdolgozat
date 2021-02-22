package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity18 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window18);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"125g csirkemell filé", "7 g vaj", "11 g finomliszt", "100 g főzőtejszín",
                "25 g krémsajt", "25 g edami sajt", "25 g parmezán sajt", "1 csipet só", "1 csipet ételízesítő",
                "cayennebors ízlés szerint", "0.5 csokor petrezselyem", "0.5 gerezd fokhagyma"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
