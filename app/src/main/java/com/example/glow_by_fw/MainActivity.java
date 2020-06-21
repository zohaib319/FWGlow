package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button user,vendor;
    TextView login,create;
    private ApiInterface apiService;
    private Call<ResponseBody> call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.btn_user);
        vendor=findViewById(R.id.btn_vendor);
        login=findViewById(R.id.btn_login);
        create=findViewById(R.id.btn_create);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),login_activity.class);
                startActivity(intent);
            }
        });
        vendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Vendor_one.class);
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
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),User_one.class);
                startActivity(intent);
            }
        });
    }
    public void testAPIMethod(){
        apiService =
                ApiClient.getClient(35).create(ApiInterface.class);
        call = apiService.UserRegister("test@gmail.com","username","user","12345678");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful())
                {
                    try {
                        JSONObject responseObj = new JSONObject(response.body().string());
                        JSONObject dataObj = responseObj.getJSONObject("data");
                        Log.d("datarecieved",dataObj.toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else
                {
                    // Catch errors here
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("inside_failure","inside_failure");
                // internet is not available
            }
        });
    }
}
