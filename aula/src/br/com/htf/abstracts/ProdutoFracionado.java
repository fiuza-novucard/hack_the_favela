package br.com.htf.abstracts;

import br.com.htf.abstracts.Produto;

public abstract class ProdutoFracionado extends Produto {
    private double peso;

    public ProdutoFracionado(String nome, double preco, double peso)  {
        super(nome, preco, 1);
        this.peso = peso;
    }

    @Override
    public double calcularValorVenda() {
        return this.getPreco() * this.getPeso();
    }
}
