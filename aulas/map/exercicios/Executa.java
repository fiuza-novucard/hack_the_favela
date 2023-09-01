package map.exercicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Executa {

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("everest", 8848.0);
        map.put("k2", 8611.0);
        map.put("kangchenjunga", 8586.0);
        map.put("lhotse", 8516.0);






        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("annapurna", 8091.0);
        linkedHashMap.put("gasherbrum", 8080.0);
        linkedHashMap.put("broad peak", 8051.0);
        System.out.println(linkedHashMap);

    }
/*
put(chave, valor): Adiciona um novo par de chave-valor ao mapa.
get(chave): Retorna o valor associado à chave especificada.
remove(chave): Remove o par de chave-valor associado à chave especificada.
containsKey(chave): Verifica se o mapa contém a chave especificada.
containsValue(valor): Verifica se o mapa contém o valor especificado.
isEmpty(): Verifica se o mapa está vazio.
size(): Retorna o número de pares de chave-valor no mapa.
keySet(): Retorna um conjunto com as chaves do mapa.
values(): Retorna um conjunto com os valores do mapa.
Além desses métodos, cada tipo de mapa também possui seus próprios métodos específicos.
Por exemplo, o HashMap possui o método hashCode(), que retorna o hashcode da chave especificada.
O TreeMap possui o método firstKey(), que retorna a primeira chave do mapa, e o método lastKey(), que retorna a última chave do mapa.
O LinkedHashMap possui os métodos entrySet(), que retorna um conjunto com as entradas do mapa, e descendingMap(), que retorna um mapa com as entradas do mapa em ordem decrescente.
 */
}
