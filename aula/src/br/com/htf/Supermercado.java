package br.com.htf;

import br.com.htf.abstracts.Produto;
import br.com.htf.exceptions.SupermercadoExceptions;
import br.com.htf.models.Cereal;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Supermercado {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double subtotal;

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public ArrayList<Produto> getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(ArrayList<Produto> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    private double totalCompra;
    private double desconto = 10;
    private String nome;
    private ArrayList<Produto> carrinhoDeCompras;

    public Supermercado() {
        this.carrinhoDeCompras = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        try {
            this.checkPrecoProdutoNaoPodeSerZero(produto);
            this.carrinhoDeCompras.add(produto);
        } catch (SupermercadoExceptions e) {
            produto.setPreco(1500);
            produto.setPeso(50);
            this.carrinhoDeCompras.add(produto);
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "VERIFIQUE O PRODUTO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public void removerProduto(Produto produto) {
        this.carrinhoDeCompras.remove(produto);
    }

    public void calcularSubtotal() {
        double subtotal = 0;
        for (Produto produto : carrinhoDeCompras) {
            double valorVendaProduto = produto.calcularValorVenda();
            System.out.println("O valor total do produto " + produto.getNome() + " é " + valorVendaProduto);
            subtotal += valorVendaProduto;
        }
        System.out.println("O valor total da compra é " + subtotal);
        this.subtotal = subtotal;
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

    public void aplicarDesconto() {
        this.totalCompra = this.subtotal;
        if (this.subtotal >= 50) {
            this.totalCompra = this.subtotal - (this.subtotal * (this.desconto / 100));
        }
        // Se o subtotal for maior do que 100, aplicar desconto de 12%
        // Se o subtotal for maior do que 200, aplicar desconto de 15%
        //IF INLINE
        // this.totalCompra = (this.subtotal >= 50)? this.subtotal - (this.subtotal * (this.desconto / 100)) : this.subtotal;
    }

    public void checkPrecoProdutoNaoPodeSerZero(Produto produto) throws IllegalArgumentException {
        Double preco = produto.getPreco();
        if (produto.getPreco() == 0  || preco == null ) {
            throw new SupermercadoExceptions("O preço do produto não pode ser zero");
        }
    }

}
