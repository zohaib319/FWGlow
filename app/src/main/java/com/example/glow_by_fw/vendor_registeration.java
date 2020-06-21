package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class vendor_registeration extends AppCompatActivity {
Button vnum;
TextView vlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_registeration);
        vnum = findViewById(R.id.btn_vnumber);
        vlog = findViewById(R.id.txt_vlogin);
        vnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vendor_cont_with_num.class);
                startActivity(intent);
            }
        });
        vlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vendor_one.class);
                startActivity(intent);
            }
        });
    }
}