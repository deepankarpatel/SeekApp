package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FishExampeList extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_exampe_list);
        listView = findViewById(R.id.fishlist);

        ArrayList<String>  arrayList = new ArrayList<>();

         arrayList.add("Common carp");
         arrayList.add("Gold fish");
         arrayList.add("Guppy");
         arrayList.add("Northern pike");
         arrayList.add("Blue tang");
         arrayList.add("Sword fish");
         arrayList.add("Ocellaris clownfish");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_black_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent intent = new Intent(FishExampeList.this, CommonCrapExplained.class);
                    startActivity(intent);
                }

                if (position==1) {
                    Intent intent = new Intent(FishExampeList.this, GoldFishExplained.class);
                    startActivity(intent);
                }
                if (position==2) {
                    Intent intent = new Intent(FishExampeList.this, GuppyExplained.class);
                    startActivity(intent);
                }

                if (position==3) {
                    Intent intent = new Intent(FishExampeList.this, NorthanPikeExplained.class);
                    startActivity(intent);
                }
                if (position==4) {
                    Intent intent = new Intent(FishExampeList.this, BlueTangExplained.class);
                    startActivity(intent);
                }
                if (position==5) {
                    Intent intent = new Intent(FishExampeList.this, SwordFishExplained.class);
                    startActivity(intent);
                }
                if (position==6) {
                    Intent intent = new Intent(FishExampeList.this, OcellarisClownfishExplained.class);
                    startActivity(intent);
                }
            }
        });



    }
}