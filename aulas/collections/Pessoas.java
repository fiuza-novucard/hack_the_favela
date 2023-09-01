package aulas.collections;

public class Pessoas implements Comparable<Pessoas> {

    private String nome;
    private int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + idade;
    }

    @Override
    public int compareTo(Pessoas outraPessoa) {
//        if(idade > outraPessoa.getIdade()){
//            return 1; // positivo fim da lista
//        } else {
//            return -1;// negativo começo da lista
//        }
        return nome.compareTo(outraPessoa.getNome());
    }
}
