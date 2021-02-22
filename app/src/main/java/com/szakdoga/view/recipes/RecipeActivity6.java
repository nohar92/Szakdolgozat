package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.szakdoga.R;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeActivity6 extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window6);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"42 g darált pulyka/csirkemell", "1 csipet oregánó", "1 csipet chilipehely",
                                     "1 csipet fokhagymapor", "1 csipet só", "leheletnyi szerecsendió",
                                     "80 g újhagyma", "17 g krémsajt", "8 g sajt", "8 g kecskesajt", "17 g spenót",
                                     "10 g kápia paprika", "1 db M-es tojás"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
        //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
