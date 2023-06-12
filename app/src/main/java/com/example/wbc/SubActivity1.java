package com.example.wbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SubActivity1 extends AppCompatActivity {

    ImageButton ibtn1;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        ibtn1 = findViewById(R.id.ibtn1);
        ibtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),SubActivity5.class);
                startActivity(intent);
            }
        });
    }
}
