package map.exercicios;

public class Montanhas {
    String nome;

    public Montanhas(String nome, double altura, String pais) {
        this.nome = nome;
        this.altura = altura;
        this.pais = pais;
    }

    double altura;
    String pais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
