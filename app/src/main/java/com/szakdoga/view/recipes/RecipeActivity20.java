package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity20 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window20);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"200 g sertésszűz", "33 g füstölt szalonna", "28 g vöröshagyma", "1 gerezd fokhagyma", "17 g paradicsom", "17 g paprika", "17 g zöldpaprika"," só ízlés szerint"," bors ízlés szerint", "0.2 kk őrölt fűszerkömény", "0.2 tk majoranna","0.3 tk fűszerpaprikam", "0.2 csokor petrezselyem", "200 g burognya", "2-3 ek kókuszolaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
