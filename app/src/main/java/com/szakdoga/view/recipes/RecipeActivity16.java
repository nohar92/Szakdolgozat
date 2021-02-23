package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity16 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window16);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"200 g csirkemell filé", "60 g bacon", "1 csipet só", "bors ízlés szerint",
                                     "1 csipet koriandermag","1 csipet kakukkfű", "1 csipet bazsalikom",
                                     "17 g kókuszzsír", "50 g köles", "160 ml víz"," ételízesítő ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
