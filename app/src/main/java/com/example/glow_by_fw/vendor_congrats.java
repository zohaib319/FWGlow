package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vendor_congrats extends AppCompatActivity {
Button vcongrats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_congrats);
        vcongrats=findViewById(R.id.btn_vendor_congrats);
        vcongrats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vendor_register_business.class);
                startActivity(intent);
            }
        });
    }
}
