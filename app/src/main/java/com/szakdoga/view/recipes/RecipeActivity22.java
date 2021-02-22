package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity22 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window22);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"169g csirkemell filé", "gyros fűszerkeverék", "1 ek olivaolaj", " 11g lila hagyma",
                "150 g paradicsom", " 200 g kígyóuborka", "19 g káposztalevél", "60 g jégsaláta", "88 g tejföl",
                "46 g újhagyma", "1 gerezd fokhagyma", "1 csipet kapor", "30 cl tej", "só ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
