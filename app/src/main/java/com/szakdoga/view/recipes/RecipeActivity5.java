package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity5 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window5);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"150 g burgonya", "80 g sárgarépa", "90 g fehérrépa","48 g gomba",
                                     "15 g zöldborsó", "25 g füstölt szalonna", "1 db L-es tojás","só ízlés szerint",
                                     "bors ízlés szerint", "zöldfűszer ízlés szerint"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}