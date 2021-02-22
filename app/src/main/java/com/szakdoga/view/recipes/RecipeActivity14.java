package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity14 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window14);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"125 g darált sertéshús", "27 g zsemle", "14 g tojás", "0.5 tk fűszerpaprika",
                "5 g zsemlemorzsa", "58 g gombakonzerv", "0.5 gerezd fokhagyma", "só ízlés szerint", "45 g lila hagyma",
                "50 g paprika", "12 g sűrített paradicsom", "50 g tejföl", "75 g víz", "10 g kókuszolaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
