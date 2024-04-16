package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PteridophytaExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pteridophyta_example_list);
        listView = findViewById(R.id.pteridophytalist);
        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Whisk Fern");
        arrayList.add("Salvinia natans");
        arrayList.add("Lophosoria quadripinnata");
        arrayList.add("Equisetidae");
        arrayList.add("Man fern");
        arrayList.add("Silver fern");


        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.list_white_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position , long id) {
                if (position==0){
                    Intent intent = new Intent(PteridophytaExampleList.this,WhiskFernExplained.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(PteridophytaExampleList.this,SalviniaNatansExplained.class);
                    startActivity(intent);
                }

                if (position==2){
                    Intent intent = new Intent(PteridophytaExampleList.this,LophosoriaQuadripinnataExplained.class);
                    startActivity(intent);
                }

                if (position==3){
                    Intent intent = new Intent(PteridophytaExampleList.this,EquisetidaeExplained.class);
                    startActivity(intent);
                }

                if (position==4){
                    Intent intent = new Intent(PteridophytaExampleList.this,ManFernExplained.class);
                    startActivity(intent);
                }

                if (position==5){
                    Intent intent = new Intent(PteridophytaExampleList.this,SilverFernExplained.class);
                    startActivity(intent);
                }


            }
        });
    }
}
