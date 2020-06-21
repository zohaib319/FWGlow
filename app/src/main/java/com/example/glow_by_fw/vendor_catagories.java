package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vendor_catagories extends AppCompatActivity {
Button vbeauty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_catagories);
        vbeauty=findViewById(R.id.btn_vendor_beauty);
        vbeauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), vendor_information.class);
                startActivity(intent);
            }
        });

    }
}
