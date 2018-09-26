package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestaurantFragment())
                .commit();
    }
}