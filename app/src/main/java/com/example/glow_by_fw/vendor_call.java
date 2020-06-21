package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vendor_call extends AppCompatActivity {
Button vaccpt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_call);
        vaccpt=findViewById(R.id.btn_vendor_accept);
        vaccpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsActivity4.class);
                startActivity(intent);
            }
        });

    }
}
