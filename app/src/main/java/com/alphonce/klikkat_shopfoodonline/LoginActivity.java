package com.alphonce.klikkat_shopfoodonline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_login);

        Button btn1 = (Button) findViewById(R.id.submitlog);
        TextView text=findViewById(R.id.creatactxtview);
        text.setOnClickListener(view -> {
            new Intent(LoginActivity.this, com.alphonce.klikkat_shopfoodonline.CreateAccountActivity.class);
            Intent intent;
            intent = new Intent(getApplicationContext(), com.alphonce.klikkat_shopfoodonline.CreateAccountActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            startActivity(intent);
        });
        btn1.setOnClickListener(view -> {
            Intent int3=new Intent(LoginActivity.this, com.alphonce.klikkat_shopfoodonline.MainActivity.class);
            startActivity(int3);
        });
    }
}