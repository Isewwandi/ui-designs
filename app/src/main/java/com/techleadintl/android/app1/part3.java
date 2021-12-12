package com.techleadintl.android.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class part3 extends AppCompatActivity {

    TextView textView;
    SearchView searchView;

    RecyclerView recyclerView;

    ArrayList<Mymodal> mymodels;

    Adapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);



//        searchView = findViewById(R.id.search_bar);

//Recylerview
        recyclerView = findViewById(R.id.rv);

        Integer[] logo ={
                R.drawable.ic_pizza,R.drawable.ic_submarin,R.drawable.ic_burger,R.drawable.ic_chips

        };

        //creating string array

        String[] name = {
                "pizza","submarine","burger","chips"
        };

        //initialization
        mymodels = new ArrayList<>();
        for(int i=0; i<logo.length;i++){

            Mymodal Model = new Mymodal (logo[i],name[i]);
            mymodels.add(Model);


    }
        //Design horizontal layout

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                part3.this,LinearLayoutManager.HORIZONTAL,false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        //initialize adapter
        Adapter = new Adapter(mymodels, part3.this);

        //set adapter to rv
        recyclerView.setAdapter(Adapter);

    }
    }