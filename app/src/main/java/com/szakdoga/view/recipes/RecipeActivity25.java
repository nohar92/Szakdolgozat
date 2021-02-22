package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity25 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window25);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"167 g pulykamell", "8 g kenyérszalonna", "17 g bacon (szeletelt)", "33 g aszalt szilva", "só ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
