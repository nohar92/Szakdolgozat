package com.szakdoga.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.szakdoga.R;

public class GenderActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender_window);

        TextInputEditText textInputEditText = findViewById(R.id.name);

        Button male = findViewById(R.id.maleButton);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textInputEditText.getText().toString();

                if (TextUtils.isEmpty(text)) {
                    alertDialog();
                } else {
                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                    startActivity(intent);
                }
            }
        });


        Button female = findViewById(R.id.femaleButton);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textInputEditText.getText().toString();

                if (TextUtils.isEmpty(text)) {
                    alertDialog();
                } else {
                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void alertDialog() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Töltse ki a mezőt/mezőket!");
        dialog.setTitle("Tip");
        dialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }
}
