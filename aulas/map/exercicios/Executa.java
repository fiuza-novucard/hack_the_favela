package map.exercicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Executa {

    public static void main(String[] args) {
        HashMap<String, Montanhas> map = new HashMap<>();
        map.put("everest", new Montanhas("Monte Everest", 8848, "Nepal"));
        map.put("k2", new Montanhas("K2", 8611, "Paquistão"));
        map.put("kangchenjunga", new Montanhas("Kangchenjunga", 8586, "Nepal"));
        map.put("lhotse", new Montanhas("Lhotse", 8516, "Nepal"));
        System.out.println(map.get("everest"));
        map.forEach((k, v) -> System.out.println(k + " " + v));
        TreeMap<String, Montanhas> treeMap = new TreeMap<>();
        LinkedHashMap<String, Montanhas> linkedHashMap = new LinkedHashMap<>();


    }
}
