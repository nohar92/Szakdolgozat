package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity7 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window7);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"1/3 csomag(69g) leveles tészta", "50 g sajtkrém", "25 g edámi sajt", "17 g bacon",
                                     "1 db L-es tojás", "92 g újhagyma", "só ízlés szerint", "bors ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}