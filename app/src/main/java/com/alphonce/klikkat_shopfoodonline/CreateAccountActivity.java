package com.alphonce.klikkat_shopfoodonline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_create_account);

        Button btn1 = (Button) findViewById(R.id.submitsign);
        TextView txt=findViewById(R.id.logintxtview);
        txt.setOnClickListener(view -> {
            new Intent(CreateAccountActivity.this, LoginActivity.class);
            Intent intent;
            intent = new Intent(getApplicationContext(), LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            startActivity(intent);
        });
        btn1.setOnClickListener(view ->
                Toast.makeText(CreateAccountActivity.this,
                        "Sign up failed! Not not connected to any database!", Toast.LENGTH_SHORT).show());
    }
}