package programowanie.zadanie4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Storage<K,V> {
    //Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
    //Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
    //Bonus:
    //Napisz rozwiązanie aby przyjmowało dowolny typ generyczny zamiast String key i value;
    private Map<K,V> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    //addToStorage(String key, String value) → dodawanie elementów do przechowywalni
    public void addToStorage(K key, V value){
         map.put(key, value);
    }
    //printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
    public void printValues(K key){
        System.out.println(map.get(key));
    }
    //findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
    public void findValues(V value){
        for (Map.Entry<K,V> entry: map.entrySet())
        if(entry.getValue().equals(value)){
            System.out.println("Klucz" + entry.getKey());
        }

    }
}
