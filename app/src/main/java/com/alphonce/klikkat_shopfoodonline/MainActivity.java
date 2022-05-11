package com.alphonce.klikkat_shopfoodonline;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment=new HomeFragment();
    CategoryFragment categoryFragment=new CategoryFragment();
    ProfileFragment profileFragment=new ProfileFragment();
    CartFragment cartFragment=new CartFragment();
    HelpFragment helpFragment=new HelpFragment();

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.linearLayout);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                    return true;
                case R.id.category:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, categoryFragment).commit();
                    return true;
                case R.id.profile:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                    return true;
                case R.id.cart:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, cartFragment).commit();
                    return true;
                case R.id.help:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, helpFragment).commit();
                    return true;
            }
            return false;
        });

    }}

