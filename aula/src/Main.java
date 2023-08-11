import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pessoa pessoa = new Pessoa("João", LocalDate.of(1990, 1, 1));
        int idade = pessoa.calcularIdade(2020);
        System.out.println("Idade: " + idade);
    }
}
