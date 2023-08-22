package br.com.htf.models;

import br.com.htf.abstracts.Produto;

public class Cereal extends Produto {

    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cereal(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularValorTotal() {
        return this.getPreco() * this.getQuantidade();
    }
}
