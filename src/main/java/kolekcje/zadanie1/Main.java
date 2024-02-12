package kolekcje.zadanie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("123");
        stringList.add("567");
        System.out.println(stringList);
        System.out.println(changeList(stringList));

    }
    //Napisz mechanizm, który skonwertuje listę typu String na listę typu Integer.

    public static List<Integer> changeList(List<String> stringList) {
        List<Integer> changed = new ArrayList<>();
        for (String string : stringList) {
            changed.add(Integer.parseInt(string));

        }return changed;
    }
}