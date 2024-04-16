package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AmphibiaExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amphibia_example_list);
        listView = findViewById(R.id.Amphibialist);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Frog");
        arrayList.add("Salamander");
        arrayList.add("Microsauria");
        arrayList.add("Amphiuma");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.list_black_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(AmphibiaExampleList.this,FrogExplained.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(AmphibiaExampleList.this,SalamenderExplained.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(AmphibiaExampleList.this,MicrosauriaExplained.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(AmphibiaExampleList.this,AmphiumaExplained.class);
                    startActivity(intent);
                }
            }
        });
    }
}