package com.example.sonyvaio.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity implements  Runnable{

    private static final int DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(this,DELAY);
    }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();


    }
}
