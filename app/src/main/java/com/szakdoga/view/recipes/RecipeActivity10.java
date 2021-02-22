package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity10 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window10);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"345 g piros kaliforniai paprika", "75 g cheddar sajt", "75 g mozzarella", "10 g kolbász," +
                "125 g koktélparadicsom", "8 g olívaolaj", "15 g pizzaszósz", "só ízlés szerint", "bors ízlés szerint",
                "oregánó ízlés szerint", "bazsalikom ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
