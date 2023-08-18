package br.com.htf.contracts;

public interface CalculoArea {
    public double calcularAreaRetangulo(double base, double altura);
    public double calcularAreaTriangulo(double base, double altura);
    public double calcularAreaCirculo(double raio);

    public double calcularAreaRetangulo(double base, double altura, String unidade);
}
