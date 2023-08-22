package br.com.htf.implementations;
import br.com.htf.contracts.CalculoArea;

public class CalculoAreaImpl implements CalculoArea {

    private double base;
    private double altura;
    private double raio;

    public CalculoAreaImpl(double base, double altura, double raio) {
        this.base = base;
        this.altura = altura;
        this.raio = raio;
    }

    @Override
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
    @Override
    public double calcularAreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    @Override
    public double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    static public double calcularAny(){
        altura = 0;
        //this.raio;
        return 0;
    }
}
