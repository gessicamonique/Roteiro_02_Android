package com.example.sonyvaio.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mTexto;
    private Button mBotao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTexto = (EditText) findViewById(R.id.cor);
        mBotao = (Button) findViewById(R.id.botaoTraduzir);

        mBotao.setOnClickListener(new Traduzir("TRADUZIR", null));

    }

    private class Traduzir implements View.OnClickListener {
        private String action;
        private String category;

        Traduzir(String action, String category) {
            this.action = action;
            this.category = category;
        }

        @Override
        public void onClick(View v) {
            String cor = mTexto.getText().toString();
            if (cor.equalsIgnoreCase("amarelo") || cor.equalsIgnoreCase("vermelho") || cor.equalsIgnoreCase("azul")) {
                Intent intent = new Intent(this.action);
                if (this.category != null) {
                    intent.addCategory(this.category);
                }
                Bundle bundle = new Bundle();
                bundle.putString("cor", cor);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            } else {

                View focus = null;
                if (TextUtils.isEmpty(cor)) {
                    mTexto.setError("Campo vazio");
                    focus = mTexto;
                    focus.requestFocus(); //mostra na tela o erro!

                } else {
                    mTexto.setError("Cor inválida, digite novamente");
                    //focus.requestFocus();
                }
            }

        }
    }


}







