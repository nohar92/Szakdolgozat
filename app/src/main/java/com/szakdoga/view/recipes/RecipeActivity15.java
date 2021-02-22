package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity15 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window15);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"200 g burgonya", "50 g finomliszt", "0.5 db M-es tojás", "0.5 csipet só",
                                     "20 g vaj", "25 g zsemlemorzsa", "20 g porcukor", "1 g fahéj", "182 g szilva"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
