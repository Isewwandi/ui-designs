package com.techleadintl.android.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class app4 extends AppCompatActivity {
    RecyclerView recyclerView,recyclerView2;

    ArrayList<modelProduct> products;

    productAdapter Adapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app4);

        //Recylerview
        recyclerView = findViewById(R.id.rv);

        Integer[] logo = {
                R.drawable.girl, R.drawable.men, R.drawable.girl1

        };

        Integer[] product = {
                R.drawable.beauty, R.drawable.beauty2, R.drawable.beauty3

        };

        //creating string array

        String[] name = {
                "Amelia Nelson", "Jhon doe", "Nathasha"
        };
        String[] work = {
                "Actress", "Actor", "Actress"
        };
        //initialization
        products = new ArrayList<>();
        for (int i = 0; i < logo.length; i++) {

            modelProduct Model = new modelProduct(logo[i], product[i], name[i], work[i]);
            products.add(Model);
        }
        //Design horizontal layout

         layoutManager = new LinearLayoutManager(
                app4.this, LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        //initialize adapter
        Adapter = new productAdapter(products, app4.this);

        //set adapter to rv
        recyclerView.setAdapter(Adapter);



        //Second Recylerview

        //Recylerview
        recyclerView2 = findViewById(R.id.rv2);

        Integer[] logo2 = {
                R.drawable.men2, R.drawable.girl3, R.drawable.men3

        };

        Integer[] product2 = {
                R.drawable.beauty4, R.drawable.beauty5, R.drawable.beauty6

        };

        //creating string array

        String[] name2 = {
                "Samantha martin", "Jack martine", "Sheril"
        };
        String[] work2 = {
                "oily skin", "dark skin", "oily skin"
        };
        //initialization
        products = new ArrayList<>();
        for (int i = 0; i < logo2.length; i++) {

            modelProduct Model2 = new modelProduct(logo2[i], product2[i], name2[i], work2[i]);
            products.add(Model2);
        }
        //Design horizontal layout

        layoutManager = new LinearLayoutManager(
                app4.this, LinearLayoutManager.HORIZONTAL, false
        );

        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());


        //initialize adapter
        Adapter = new productAdapter(products, app4.this);

        //set adapter to rv
        recyclerView2.setAdapter(Adapter);





    }

}