package br.com.htf.models;

import br.com.htf.abstracts.Produto;

public class Bebida extends Produto {
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private double volume;
    public Bebida(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }



}
