package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vendor_one extends AppCompatActivity {
Button vlogin;
TextView vregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_one);
        vregister = findViewById(R.id.txt_vendor_register);
        vlogin=findViewById(R.id.btn_vendor_login);
        vregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vendor_registeration.class);
                startActivity(intent);
            }
        });
        vlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vendor_register_business.class);
                startActivity(intent);
            }
        });
    }
}