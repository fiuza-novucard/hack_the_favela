package collections;

import java.util.*;

public class SetExemplo {
    public static void main(String[] args) {
        Set<Integer> setDeInteiros = new HashSet<>();
        setDeInteiros.add(3);
        setDeInteiros.add(6);
        setDeInteiros.add(4);
        setDeInteiros.add(50);
        setDeInteiros.add(61);
        setDeInteiros.add(14);
        System.out.println(setDeInteiros);

        Set<Integer> treeSetDeInteiros = new TreeSet<>();
        treeSetDeInteiros.add(3);
        treeSetDeInteiros.add(6);
        treeSetDeInteiros.add(4);
        treeSetDeInteiros.add(50);
        treeSetDeInteiros.add(61);
        treeSetDeInteiros.add(14);
        System.out.println(treeSetDeInteiros);

        Pessoas pessoa1 = new Pessoas("Allan", 28);
        Pessoas pessoa2 = new Pessoas("Alexis", 37);
        Pessoas pessoa3 = new Pessoas("Beatriz", 33);
        Pessoas pessoa4 = new Pessoas("Israel", 44);
        Pessoas pessoa5 = new Pessoas("Leandro", 36);
        Pessoas pessoa6 = new Pessoas("Santiago", 16);
        Pessoas pessoa7 = new Pessoas("Steven", 20);

        Set<Pessoas> pessoas = new TreeSet<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        System.out.println(pessoas);

        Set<Integer> linkedSetDeInteiros = new LinkedHashSet<>();
        linkedSetDeInteiros.add(3);
        linkedSetDeInteiros.add(6);
        linkedSetDeInteiros.add(4);
        linkedSetDeInteiros.add(50);
        linkedSetDeInteiros.add(61);
        linkedSetDeInteiros.add(14);
        System.out.println(linkedSetDeInteiros);

        Queue<Integer> fila = new PriorityQueue<>();
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(8);
        fila.add(15);
        fila.add(5);
        System.out.println(fila);

        System.out.println("Peek: " + fila.peek());
        System.out.println("Pool: " + fila.poll());
        System.out.println(fila);
        System.out.println("Pool: " + fila.poll());
        System.out.println(fila);
        System.out.println("Pool: " + fila.poll());
        System.out.println(fila);
        System.out.println("Pool: " + fila.poll());
        System.out.println(fila);
        System.out.println("Pool: " + fila.poll());
        System.out.println(fila);

    }
}
