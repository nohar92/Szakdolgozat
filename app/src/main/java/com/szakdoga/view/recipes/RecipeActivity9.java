package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity9 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window9);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"100 g alma", "1 db S-es tojás", "25 g zabpehely",
                "30 g zabpehelyliszt", "1 csipet só", "édesítőszer", "egy csipet fahéj", "5 g kókuszolaj"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this, R.layout.ingredient_rows, ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
