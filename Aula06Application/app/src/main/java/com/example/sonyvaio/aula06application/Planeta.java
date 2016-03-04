package com.example.sonyvaio.aula06application;

/**
 * Created by sony vaio on 03/03/2016.
 */
public class Planeta {
    private String nome;
    private int IdImagem;

    public Planeta(int idImagem, String nome) {

        IdImagem = idImagem;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdImagem() {
        return IdImagem;
    }

    public void setIdImagem(int idImagem) {
        IdImagem = idImagem;
    }

}
