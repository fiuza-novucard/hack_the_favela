package br.com.htf.implementations;

import br.com.htf.contracts.CalculoArea;

public class Retangu extends CalculoArea {

 private double altura;
 private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularAreaRetangulo(double base, double altura) {
        return 0;
    }
}
