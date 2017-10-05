package com.example.david.listexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<OnePunchMan> heroes;
    private ListView heroListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        //get the list of items you want to show set up
        createOnePunchMan();
        //create the adapter that will be the go between from the list to the list view
        ArrayAdapter<OnePunchMan>adapter
                = new ArrayAdapter<OnePunchMan>(this, android.R.layout.simple_list_item_1, heroes);
        heroListView.setAdapter(adapter);
        heroListView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, heroes.get(position).getName(), Toast.LENGTH_SHORT).show();
                String name = heroes.get(position).getName();


            }
        });
    }



    private void createOnePunchMan() {
        heroes = new ArrayList<>();
        heroes.add(new OnePunchMan("Onepunman","Half man, Half god",1,0));
        heroes.add(new OnePunchMan("Billyman","Half man, Half girl",2,0));
        heroes.add(new OnePunchMan("Superman","Half man, Half god",3,0));
        heroes.add(new OnePunchMan("Xenoth","Half man, Half robot",4,0));
        heroes.add(new OnePunchMan("Antman","Half man, Half ant",5,0));
        heroes.add(new OnePunchMan("Wonsoonman","Half man, Half monkey",6,0));

    }

    private void wireWidgets() {
        heroListView = (ListView) findViewById(R.id.listview_hero);
    }
}
