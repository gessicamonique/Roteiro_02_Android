package com.example.sonyvaio.roteiro02;


import android.support.v7.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TraduzirInglesActivity extends AppCompatActivity {

    private TextView mTexto;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_ingles);

        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        String cor = "";
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            cor = bundle.getString("cor");
        }

        mTexto = (TextView) findViewById(R.id.textoIngles);

        if (cor != null) {
            if (cor.equalsIgnoreCase("amarelo")) { // verifica a cores e diz a tradução em inglês, põe a cor no TextView
                mTexto.setText("A tradução para inglês de " + cor + " é: Yellow!");
            } else if (cor.equalsIgnoreCase("vermelho")) {
                mTexto.setText("A tradução para inglês de " + cor + " é: Red!");
            } else if (cor.equalsIgnoreCase("azul")) {
                mTexto.setText("A tradução para inglês de " + cor + " é: Blue!");
            }

        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }


}

