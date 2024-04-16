package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ReptilesExampleList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptiles_example_list);
        listView = findViewById(R.id.Reptileslist);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Lizard");
        arrayList.add("Turtle");
        arrayList.add("Snake");
        arrayList.add("Crocodile");
        arrayList.add("Chameleon");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_black_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(ReptilesExampleList.this,LizardExplained.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(ReptilesExampleList.this,TurtleExplained.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(ReptilesExampleList.this,SnakeExplained.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(ReptilesExampleList.this,CrocodileExplained.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(ReptilesExampleList.this,ChameleonExplained.class);
                    startActivity(intent);
                }
            }
        });

    }
}