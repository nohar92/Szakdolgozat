package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity11 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window11);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"400 g libacomb", "150 g birs", "85 g sárgarépa", "45 g édesburgonya",
                "100 g burgonya", "11 g kacsazsír", "4 g méz", "1 gerezd fokhagyma", " só ízlés szerint",
                "bors ízlés szerint", "majoranna ízlés szerint", "0.5 szál rozmaring"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
