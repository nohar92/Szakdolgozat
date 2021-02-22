package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity23 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window23);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"27 g parasztkolbász", "20 g kenyérszalonna", "60 g vöröshagyma",
                "165 g tv paprika", "120 g paradicsom"," 70 g cukinni", "1 db L-es tojás", "1 gerezd fokhagyma",
                "himalája só ízlés szerint"," bors ízlés szerint", "római kömény ízlés szerint",
                " 1 tk fűszerpaprika", "petrezselyem", "3 csepp csiliszósz"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
