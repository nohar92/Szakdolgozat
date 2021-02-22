package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity8 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window8);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"3 db tojásfehérje", "1 db L-es tojás", "fél csokor petrezselyem", "90 g snidling",
                "80 g prágai sonka", "68 g bacon", "só ízlés szerint", "bors ízlés szerint",
                "chilipehely ízlés szerint", "40 g sajt", "1 ek oliva- vagy kókuszolaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
