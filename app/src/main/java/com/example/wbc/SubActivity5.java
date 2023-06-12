package com.example.wbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SubActivity5 extends AppCompatActivity {

    ImageButton ibtn1;
    ImageButton ibtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub5);

        ibtn1 = findViewById(R.id.ibtn1);
        ibtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),SubActivity1.class);
                startActivity(intent);
            }
        });

        ibtn2 = findViewById(R.id.ibtn2);
        ibtn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),SubActivity1.class);
                startActivity(intent);
            }
        });
    }
}