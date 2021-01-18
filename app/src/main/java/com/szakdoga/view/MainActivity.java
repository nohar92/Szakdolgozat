package com.szakdoga.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.szakdoga.R;
import com.szakdoga.view.GenderActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


    Button calculate = (Button) findViewById(R.id.calculate);
    calculate.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view){
            Intent intent = new Intent(view.getContext(), GenderActivity.class);
            startActivity(intent);

    }
    });

}
}