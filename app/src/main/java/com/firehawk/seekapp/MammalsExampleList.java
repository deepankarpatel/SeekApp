package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MammalsExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mammals_example_list);
        listView = findViewById(R.id.Mammalslist);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Bear");
        arrayList.add("Deer");
        arrayList.add("Elephant");
        arrayList.add("Horse");
        arrayList.add("Apes");
        arrayList.add("Lion");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_black_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(MammalsExampleList.this,BearExplained.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(MammalsExampleList.this,DeerExplained.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(MammalsExampleList.this,ElephantExplained.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(MammalsExampleList.this,HorseExplained.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(MammalsExampleList.this,ApesExplained.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(MammalsExampleList.this,LionExplained.class);
                    startActivity(intent);
                }
            }
        });
    }
}