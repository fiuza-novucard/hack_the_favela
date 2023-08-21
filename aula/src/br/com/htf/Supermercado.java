package br.com.htf;

import br.com.htf.abstracts.Produto;
import br.com.htf.models.Cereal;

import java.util.ArrayList;
import java.util.Objects;

public class Supermercado {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    private ArrayList<Produto> carrinhoDeCompras;

    public Supermercado() {
        this.carrinhoDeCompras = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.carrinhoDeCompras.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.carrinhoDeCompras.remove(produto);
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Produto produto : carrinhoDeCompras) {
            double valorVendaProduto = produto.calcularValorTotal();
            System.out.println("O valor total do produto " + produto.getNome() + " é " + valorVendaProduto);
            subtotal += valorVendaProduto;
        }
        System.out.println("O valor total da compra é " + subtotal);
        return subtotal;
    }

    public double calcularPesoTotal() {
        double pesoTotal = 0;

        for (Produto produto : carrinhoDeCompras) {
            if (produto instanceof Cereal) {
                Cereal cereal = (Cereal) produto;
                pesoTotal += cereal.getPeso();
            }

        }
        System.out.println("O peso total da compra é " + pesoTotal);
        return pesoTotal;
    }


}
