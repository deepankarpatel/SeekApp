package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArthopodaExampleList extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arthopoda_example_list);
        listView = findViewById(R.id.Arthopodalist);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Spider");
        arrayList.add("Scorpions");
        arrayList.add("Centipedes");
        arrayList.add("Crabs");
        arrayList.add("Butterflies");


        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.list_black_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i , long id) {
                if (i==0){
                    Intent intent = new Intent(ArthopodaExampleList.this,SpiderExplained.class);
                    startActivity(intent);
                }

                if (i==1){
                    Intent intent = new Intent(ArthopodaExampleList.this,ScorpionExplained.class);
                    startActivity(intent);
                }
                if (i==2){
                    Intent intent = new Intent(ArthopodaExampleList.this,CentipedeExplained.class);
                    startActivity(intent);
                }
                if (i==3){
                    Intent intent = new Intent(ArthopodaExampleList.this,CrabExplained.class);
                    startActivity(intent);
                }
                if (i==4){
                    Intent intent = new Intent(ArthopodaExampleList.this,ButterflyExplained.class);
                    startActivity(intent);
                }

            }
        });
    }
}
