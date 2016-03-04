package com.example.sonyvaio.aula06application;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sony vaio on 03/03/2016.
 */
public class Aula06Application extends Application {

    private List<Planeta> planetas;

    @Override
    public void onCreate() {
        super.onCreate();
        criarPlanetas();
        planetas = new ArrayList<>();

    }

    private void criarPlanetas() {
        planetas.add(new Planeta(R.drawable.mercurio, "Mércurio"));
        planetas.add(new Planeta(R.drawable.venus, "Vênus"));
        planetas.add(new Planeta(R.drawable.terra, "Terra"));
        planetas.add(new Planeta(R.drawable.jupter, "Júpiter"));
        planetas.add(new Planeta(R.drawable.saturno, "Saturno"));
        planetas.add(new Planeta(R.drawable.urano, "Urano"));
        planetas.add(new Planeta(R.drawable.netuno, "Neturno"));

    }

}