package com.techleadintl.android.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("j");
    }

    public void part1(View view) {
        Intent intent = new Intent(getApplicationContext(),part1.class);
        startActivity(intent);
    }

    public void part2(View view) {
        Intent intent = new Intent(getApplicationContext(),part2.class);
        startActivity(intent);
    }

    public void part3(View view) {
        Intent intent = new Intent(getApplicationContext(),part3.class);
        startActivity(intent);
    }

    public void part4(View view) {
        Intent intent = new Intent(getApplicationContext(),app4.class);
        startActivity(intent);
    }

    public void part5(View view) {
        Intent intent = new Intent(getApplicationContext(),part5.class);
        startActivity(intent);
    }
}