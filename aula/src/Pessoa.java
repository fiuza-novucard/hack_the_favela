import java.math.BigInteger;
import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade( int ano) {
        return ano - dataNascimento.getYear();
    }

}
