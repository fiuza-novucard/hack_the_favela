package br.com.htf.abstracts;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){

    }
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.peso = 1;
    }
    public Produto(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;

        this.peso = peso;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private String marca;
    private double peso;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorVenda(){
        System.out.println("Calculando valor total de produtos");
        return this.getPreco() * this.getQuantidade();
    }


}
