package br.com.htf.abstracts;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){

    }
    public Produto(String nome, double preco, int quantidade)  {
        try {
            this.checkPrecoNegativo(preco);
            this.checkQuantidadeNegativa(quantidade);
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
            this.peso = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void checkPrecoNegativo(double preco) throws Exception{
        if (preco < 0){
            throw new Exception("Preço não pode ser negativo");
        }
    }
    public void checkQuantidadeNegativa(double quantidade) throws  Exception{
        if (quantidade < 0){
            throw new Exception("Quantidade nao pode ser negativa");
        }
    }


}
