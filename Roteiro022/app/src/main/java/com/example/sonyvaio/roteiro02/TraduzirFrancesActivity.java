package com.example.sonyvaio.roteiro02;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TraduzirFrancesActivity extends AppCompatActivity {
   private TextView mTexto;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduzir_frances);

        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        String cor = "";
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            cor = bundle.getString("cor");
        }

        mTexto = (TextView) findViewById(R.id.textoFrances);

        if (cor != null) {
            if (cor.equalsIgnoreCase("amarelo")) { // verifica a cores e diz a tradução em francês, põe a cor no TextView
                mTexto.setText("A tradução para francês de " + cor + " é: Jaune!");
            }else if (cor.equalsIgnoreCase("vermelho")) {
                mTexto.setText("A tradução para francês de " + cor + " é: Rouge!");
            }else if (cor.equalsIgnoreCase("azul")) {
                mTexto.setText("A tradução para francês de " + cor + " é: Bleu!");
            }
            }
        }


        public boolean onCreateOptionsMenu(Menu menu){
            return true;
        }

        public boolean onOptionsItemSelected (MenuItem item){
            if(item.getItemId() == android.R.id.home){
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();

            }
            return super.onOptionsItemSelected(item);
        }

    }

