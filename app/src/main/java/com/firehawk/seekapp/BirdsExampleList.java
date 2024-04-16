package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BirdsExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds_example_list);
        listView = findViewById(R.id.Birdslist);

        ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("Parrot");
        arrayList.add("Owl");
        arrayList.add("Hummingbird");
        arrayList.add("Penguins");
        arrayList.add("Swallow");
        arrayList.add("Woodpecker");
        arrayList.add("Kingfisher");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_black_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(BirdsExampleList.this,ParrotExplained.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(BirdsExampleList.this,OwlExplained.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(BirdsExampleList.this,HummingbirdExplained.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(BirdsExampleList.this,PenguinExplained.class);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(BirdsExampleList.this,SwallowExplained.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(BirdsExampleList.this,WoodpeckerExplained.class);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(BirdsExampleList.this,KingfisherExplained.class);
                    startActivity(intent);
                }
            }
        });
    }
}