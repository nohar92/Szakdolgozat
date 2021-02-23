package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity17 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window17);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"150 g darált sertéshús", "0.3 nagy fej vöröshagyma"," 1 gerezd fokhagyma",
                                     "30 g kápia paprika"," 25 g zöldpaprika", "50 g sűrített paradicsom",
                                     "0.5 db chili", "100 g vörösbab", "100 g csemegekukorica", "13 g mexikói alap",
                                     "só ízlés szerint", "bors ízlés szerint", "cayenne bors ízlés szerint",
                                     "10 g kókuszolaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
