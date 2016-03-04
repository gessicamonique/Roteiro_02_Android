package com.example.sonyvaio.aula03;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class SplashActivity extends AppCompatActivity implements Runnable{

    private static final int DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(this,DELAY); // ele irá mandar para a outra thread para aplicar o DELAY
          }

    @Override
    public void run() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }


}
