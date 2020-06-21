package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class User_one extends AppCompatActivity {
    Button number;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_one);
        number=findViewById(R.id.btn_number);
        login=findViewById(R.id.txt_login);
        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels= new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.card_1));
        slideModels.add(new SlideModel(R.drawable.card_2));
        imageSlider.setImageList(slideModels, true);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),cont_with_num.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),login_activity.class);
                startActivity(intent);
            }
        });
    }
}
