package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity2 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window2);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"0.5 dl víz", "5 dkg rizs", "1.3 dl tej", "1 csomag vaníliás cukor",
                                     "1 dl habtejszín", "0.5 csomag habfixáló", "1 ek cukor", "5 dkg eper",
                                     "5 dkg szeder", "1.3 dkg vaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
