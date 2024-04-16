package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BryophytaExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bryophyta_example_list);
        listView = findViewById(R.id.bryohytalist);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Mosses");
        arrayList.add("Liverworts");
        arrayList.add("Hornworts");


        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.list_white_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i , long id) {
                if (i==0){
                    Intent intent = new Intent(BryophytaExampleList.this,MossesExplained.class);
                    startActivity(intent);
                }

                if (i==1){
                    Intent intent = new Intent(BryophytaExampleList.this,LiverwortsExplained.class);
                    startActivity(intent);
                }
                if (i==2){
                    Intent intent = new Intent(BryophytaExampleList.this,HornwortsExplained.class);
                    startActivity(intent);
                }

            }
        });
    }
}
