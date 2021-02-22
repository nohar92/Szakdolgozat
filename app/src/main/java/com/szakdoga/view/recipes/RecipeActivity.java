package com.szakdoga.view.recipes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.szakdoga.R;
import com.szakdoga.model.Ingredients;
import com.szakdoga.view.BulkingMenuOfferActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeActivity extends BulkingMenuOfferActivity {

    private ListView ingredients;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_window);

        ingredients = findViewById(R.id.ingredients_list);

        String[] ingr = new String[]{"2 db M-es tojás", "10 dkg virsli", "1 db kaliforniai paprika", "1 db olivabogyó"};

        ArrayList<String> ingrList = new ArrayList<String>(Arrays.asList(ingr));
        listAdapter = new ArrayAdapter<String>(this,R.layout.ingredient_rows,ingrList);
      //  listAdapter.add();

        ingredients.setAdapter(listAdapter);
    }
}
