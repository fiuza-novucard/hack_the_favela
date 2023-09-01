# AULA DE MAPS
Os 3 principais tipos de mapas são:
- HashMap: é a implementação mais simples do Map. Ela usa uma tabela hash para armazenar os pares de chave-valor, o que permite acesso rápido aos dados. 

- TreeMap: é uma implementação do Map que ordena os pares de chave-valor em ordem crescente. Isso pode ser útil para aplicações que precisam acessar os dados em ordem.

- LinkedHashMap: é uma implementação do Map que mantém a ordem em que os pares de chave-valor são inseridos. Isso pode ser útil para aplicações que precisam acessar os dados na ordem em que foram inseridos.

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