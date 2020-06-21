package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class my_bookings extends AppCompatActivity {
    private Toolbar mytoolbar;
    private TabLayout layout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bookings);
        mytoolbar=findViewById(R.id.tool_id);
        layout=findViewById(R.id.tablayout_id);
        viewPager=findViewById(R.id.viewpager_id);
        setSupportActionBar(mytoolbar);
        setupViewPager(viewPager);
        layout.setupWithViewPager(viewPager);
    }


    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new upcoming2(), "Upcoming");
        viewPagerAdapter.addFragment(new history2(), "History");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
