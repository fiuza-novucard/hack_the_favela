package br.com.htf.models;

import br.com.htf.abstracts.Produto;

public class Carnes extends Produto {


    public Carnes(String nome, double preco, double peso) {
        super(nome, preco, peso);
    }

    @Override
    public double calcularValorVenda() {
        System.out.println("Calculando valor total de Carnes");
        return this.getPreco() * this.getPeso();
    }
}
