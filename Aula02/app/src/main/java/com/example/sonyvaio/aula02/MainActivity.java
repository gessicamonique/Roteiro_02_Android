package com.example.sonyvaio.aula02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle b = getIntent().getExtras();
        String texto = b.getString("nome");
        mTexto.setText("Olá" + texto + "seja bem-vindo!");
    }
}
