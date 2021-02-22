package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity12 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window12);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"5 dkg sertés rövidkaraj", "0.5 közepes db paradicsom", "25 g  burgonya",
                "23 g vöröshagyma", "15 g tejföl", "0.5 teáskanál mustár", "38 g trappista sajt", "10 g kókuszolaj",
                "só ízlés szerint", "bors ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
