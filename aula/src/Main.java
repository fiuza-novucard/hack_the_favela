import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Pessoa pessoa = new Pessoa("Leandro", LocalDate.of(1987, 1, 12));
        int idade = pessoa.calcularIdade(2023);
        System.out.println("Idade: " + idade);
    }
}
