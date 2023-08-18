package br.com.htf.implementations;
import br.com.htf.contracts.CalculoArea;

public class CalculoAreaImpl implements CalculoArea {
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
}
