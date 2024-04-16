package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlantClassification extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_classification);
        button1 = findViewById(R.id.thallophytabtn);
        button2 = findViewById(R.id.bryophytabtn);
        button3 = findViewById(R.id.pteridophytabtn);
        button4 = findViewById(R.id.gymnospermsbtn);
        button5 = findViewById(R.id.angiospermsbtn);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t = new Intent(PlantClassification.this,AngiospermExampleList.class);
                startActivity(t);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(PlantClassification.this,GymnospermExampleList.class);
                startActivity(e);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(PlantClassification.this,PteridophytaExampleList.class);
                startActivity(n);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlantClassification.this,BryophytaExampleList.class);
                startActivity(i);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlantClassification.this,ThallophytaExampleList.class);
                startActivity(intent);
            }
        });
        
    }
}
