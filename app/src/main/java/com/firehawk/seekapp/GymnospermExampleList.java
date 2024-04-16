package com.firehawk.seekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GymnospermExampleList extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymnosperm_example_list);
        listView = findViewById(R.id.gymnospermlist);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Cycas");
        arrayList.add("Pinus");
        arrayList.add("Araucaria");
        arrayList.add("Thuja");
        arrayList.add("Cedrus");
        arrayList.add("Picea");


        ArrayAdapter arrayAdapter= new ArrayAdapter(this, R.layout.list_white_text,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i , long id) {
                if (i==0){
                    Intent intent = new Intent(GymnospermExampleList.this,CycasExplained.class);
                    startActivity(intent);
                }

                if (i==1){
                    Intent intent = new Intent(GymnospermExampleList.this,PinusExplained.class);
                    startActivity(intent);
                }

                if (i==2){
                    Intent intent = new Intent(GymnospermExampleList.this,AraucariaExplained.class);
                    startActivity(intent);
                }

                if (i==3){
                    Intent intent = new Intent(GymnospermExampleList.this,ThujaExplained.class);
                    startActivity(intent);
                }

                if (i==4){
                    Intent intent = new Intent(GymnospermExampleList.this,CedrusExplained.class);
                    startActivity(intent);
                }

                if (i==5){
                    Intent intent = new Intent(GymnospermExampleList.this,PiceaExplained.class);
                    startActivity(intent);
                }


            }
        });
    }
}

