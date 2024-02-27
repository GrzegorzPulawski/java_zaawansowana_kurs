package programowanie.zadanie1;

import java.util.*;

public class Main {
    //Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
    //Poszukaj odpowiednich metod do sortowania w klasach:
    //Collections (static method)
    //List (non-static method)
    //Poszukaj potrzebnych obiektów Comparator w klasach:
    //Comparator
    //Collections
    //String
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>( List.of("drzewo", "kwiat", "trawa"));
        List<String> sortedList = sortFromZtoA(stringList);

        System.out.println("Posortowana lista: ");
        for (String word : sortedList) {
            System.out.println(word);
        }
    }
    public static List<String> sortFromZtoA(List<String> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
