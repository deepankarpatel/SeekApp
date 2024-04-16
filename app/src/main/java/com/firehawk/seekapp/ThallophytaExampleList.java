package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ThallophytaExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thallophyta_example_list);
        listView = findViewById(R.id.thallophytalist);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Algae");
        arrayList.add("Fungi");


        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.list_white_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i , long id) {
                if (i==0){
                    Intent intent = new Intent(ThallophytaExampleList.this,AlgaeExplained.class);
                    startActivity(intent);
                }
                if (i==1){
                    Intent intent = new Intent(ThallophytaExampleList.this, FungiExplained.class);
                    startActivity(intent);
                }
            }
        });
    }
}
