package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity26 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window26);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"56 g csirkemell filé", "85 g citrom", "100 g rizs", "só ízlés szerint",
                                     "bors ízlés szerint", "chili ízlés szerint", "kakukkfű ízlés szerint",
                                     "3 gerezd fokhagyma"," 200 g cukkinivirág"," 25 g vaj", "250 g víz"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
