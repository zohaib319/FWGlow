package com.example.glow_by_fw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Splash extends Activity{
    ImageView img;
    public static int splash=5000;
    LazyLoader lazyLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      //  printHashKey();
        lazyLoader =findViewById(R.id.lazy_loader);
        img=findViewById(R.id.splash_image);
        Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        img.startAnimation(a);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },5000);

        Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.fw_glow);
// Resize the bitmap to 150x100 (width x height)
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap, 600, 600, true);
// Loads the resized Bitmap into an ImageView
        ImageView image = (ImageView) findViewById(R.id.splash_image);
        image.setImageBitmap(bMapScaled);
        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_defalut));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

        lazyLoader.addView(loader);
    }
   // public void printHashKey(){
        // Add code to print out the key hash
     //   try {
       //     PackageInfo info = getPackageManager().getPackageInfo(
         //           "com.example.glow_by_fw",
           //         PackageManager.GET_SIGNATURES);
            //for (Signature signature : info.signatures) {
              //  MessageDigest md = MessageDigest.getInstance("SHA");
                //md.update(signature.toByteArray());
       //         Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
         //   }
       // } catch (PackageManager.NameNotFoundException e) {

        //} catch (NoSuchAlgorithmException e) {

        //}
    //}

}
