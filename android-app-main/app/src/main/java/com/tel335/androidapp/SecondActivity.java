package com.tel335.androidapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle parameters = getIntent().getExtras();
        String name = parameters.getString("str");
        int number = parameters.getInt("number");

    }

    }
