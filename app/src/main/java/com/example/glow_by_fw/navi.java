package com.example.glow_by_fw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class navi extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar tools;
    TextView sign;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navi);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigation_view);
        tools = findViewById(R.id.toolbar);
        sign=findViewById(R.id.sign_out);
        setSupportActionBar(tools);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, tools, R.string.drawerOpen, R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),login_activity.class);
                startActivity(intent);
                finish();
                Toast.makeText(getApplicationContext(), "Successfully Sign Out", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected (@NonNull MenuItem item){
        int id=item.getItemId();
        if (id==R.id.booking_my)
        {
            Intent intent = new Intent(getApplicationContext(), my_bookings.class);
            startActivity(intent);
            return true;
        }
        else if (id==R.id.payout_detail){
            Intent intent = new Intent(getApplicationContext(), payoutdetails.class);
            startActivity(intent);
            return true;
        }
        else if (id==R.id.update_password){
            Intent intent = new Intent(getApplicationContext(), updatepassword.class);
            startActivity(intent);
            return true;
        }
        else if (id==R.id.update_email){
            Intent intent = new Intent(getApplicationContext(), updateemail.class);
            startActivity(intent);
            return true;
        }
        else if (id==R.id.delete_account){
            Intent intent = new Intent(getApplicationContext(), deletingaccount.class);
            startActivity(intent);
            return true;
        }
        drawerLayout=findViewById(R.id.drawer);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}


