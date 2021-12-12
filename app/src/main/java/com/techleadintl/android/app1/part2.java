package com.techleadintl.android.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class part2 extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<model> models;

     MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);


        recyclerView = findViewById(R.id.rv);

        Integer[] logo ={
                R.drawable.java,R.drawable.php,R.drawable.css,R.drawable.html,
                R.drawable.c
        };

        //creating string array

        String[] name = {
                "Java","Php","CSS","html","c++"
        };

        //initialization
        models = new ArrayList<>();
        for(int i=0; i<logo.length;i++){

            model Model = new model (logo[i],name[i]);
            models.add(Model);

        }

        //Design horizontal layout

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                part2.this,LinearLayoutManager.HORIZONTAL,false

        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        //initialize adapter
        myAdapter = new MyAdapter(models, part2.this);

        //set adapter to rv
        recyclerView.setAdapter(myAdapter);

    }
}