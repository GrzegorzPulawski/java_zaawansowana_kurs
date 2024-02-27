package programowanie.zadanie2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>( List.of("drzewo","Kwiat", "kwiat", "trawa", "Drzewo"));
        List<String> sortedList = sortFromZtoA(stringList, new IgnoreCase());

        System.out.println("Posortowana lista: ");
        for (String word : sortedList) {
            System.out.println(word);
        }
    }
    public static List<String> sortFromZtoA(List<String> list, Comparator<String> comparator) {
        Collections.sort(list, comparator.reversed());
        return list;

    }
}
