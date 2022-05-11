package com.alphonce.klikkat_shopfoodonline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class WelcomeActivity extends AppCompatActivity{
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_welcome);

        Button but1= findViewById(R.id.Reg);
        TextView txt=findViewById(R.id.textView4);

        but1.setOnClickListener(view -> {
            Intent int1=new Intent(WelcomeActivity.this, com.alphonce.klikkat_shopfoodonline.CreateAccountActivity.class);
            startActivity(int1);
        });
        txt.setOnClickListener(view -> {
            Intent int2=new Intent(WelcomeActivity.this,LoginActivity.class);
            startActivity(int2);
        });


    }

    @Override
    public void onBackPressed() {
        if (backPressedTime +2000>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}