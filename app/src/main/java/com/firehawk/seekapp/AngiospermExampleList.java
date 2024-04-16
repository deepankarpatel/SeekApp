package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AngiospermExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angiosperm_example_list);
        listView = findViewById(R.id.angiospermlist);
        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Monocotyledons");
        arrayList.add("Dicotyledons");


        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.list_white_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(AngiospermExampleList.this,MonocotyledonsExplained.class);
                    startActivity(intent);
                }

                if (position == 1){
                    Intent intent = new Intent(AngiospermExampleList.this,DicotyExplained.class);
                    startActivity(intent);
                }
            }
        });
    }
}
