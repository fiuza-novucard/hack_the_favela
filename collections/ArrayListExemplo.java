package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExemplo {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();

        String pessoa1 = "Alexis";
        String pessoa2 = "Leandro";
        String pessoa3 = "Allan";
        String pessoa4 = "Beatriz";
        String pessoa5 = "Santiago";
        String pessoa6 = "Steven";
        String pessoa7 = "Israel";

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        System.out.println(pessoas);

        pessoas.add(3, pessoa3);
        System.out.println(pessoas);

        pessoas.remove(pessoa3);
        System.out.println(pessoas);

        pessoas.remove(1);
        System.out.println(pessoas);

        for (String pessoa : pessoas) {
            System.out.print(pessoa + " ");
        }

        System.out.println();
        pessoas.forEach( pessoa -> {
            System.out.print(pessoa + " ");
        });

        System.out.println();
        System.out.println(pessoas.get(2));
        pessoas.set(2, pessoa3);
        System.out.println(pessoas.get(2));

        System.out.println(pessoas);

        List<String> outrasPessoas = new java.util.ArrayList<>();
        outrasPessoas.add(pessoa2);
        outrasPessoas.add(pessoa5);
        System.out.println(outrasPessoas);
        System.out.println(pessoas);

        pessoas.addAll(outrasPessoas);
        System.out.println(pessoas);

        Collections.sort(pessoas);
        System.out.println(pessoas);

    }
}
