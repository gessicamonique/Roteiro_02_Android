package com.example.sonyvaio.aula02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

   private EditText mUsuario;
   private EditText mSenha;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUsuario = (EditText)findViewById(R.id.usuario);
        mSenha = (EditText)findViewById(R.id.senha);
        mButton = (Button)findViewById(R.id.botao);



        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();

            }
        });
    }

    private void logar(){
        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();


        if(usuario.equalsIgnoreCase("gessicamonique") && senha.equalsIgnoreCase("123")){
            Intent i = new Intent(this,MainActivity.class);
            Bundle b = new Bundle();
            b.putString("nome", usuario);
            i.putExtras(b); // guarda o bundle dentro da intent;
            startActivity(i);
            finish(); // destroyed um evento;
        }
        else{
            View focus = null;
            if(TextUtils.isEmpty(usuario)){
                mUsuario.setError("CAMPO VAZIO");
                focus = mUsuario;
                focus.requestFocus(); // mostra na tela o erro!
            }
            if(TextUtils.isEmpty(senha)){
                mSenha.setError("CAMPO VAZIO");
                focus = mSenha;
                focus.requestFocus();
            }
            else{
                mUsuario.setError("Usuário ou senha inválidos!");
                focus = mUsuario;
                focus.requestFocus();

            }
        }
    }
}
