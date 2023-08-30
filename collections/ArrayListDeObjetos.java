package collections;

import java.util.*;

public class ArrayListDeObjetos {
    public static void main(String[] args) {

        Pessoas pessoa1 = new Pessoas("Allan", 28);
        Pessoas pessoa2 = new Pessoas("Alexis", 37);
        Pessoas pessoa3 = new Pessoas("Beatriz", 33);
        Pessoas pessoa4 = new Pessoas("Israel", 44);
        Pessoas pessoa5 = new Pessoas("Leandro", 36);
        Pessoas pessoa6 = new Pessoas("Santiago", 16);
        Pessoas pessoa7 = new Pessoas("Steven", 20);

        List<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        pessoas.add(pessoa1);

        System.out.println(pessoas);

        System.out.println(pessoas);

//        String nome = "Allan";
//        String nome2 = "Alexis";
//
//        int resultado = nome2.compareTo(nome);
//
//        System.out.println(resultado);
    }
}
