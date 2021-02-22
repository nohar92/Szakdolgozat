package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity13 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window13);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"125 g tonhal", "2 ek olívaolaj", "só ízlés szerint", "bors ízlés szerint",
                "500 g lila édesburgonya", "50 g vaj", "50 ml főzőtejszín", "10 g tejföl", "25 g spenót", "1 ek citromlé",
                "10 g olivaolaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
