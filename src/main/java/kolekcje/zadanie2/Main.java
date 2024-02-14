package kolekcje.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Na podstawie poniższej listy napisz mechanizm, który zwróci tylko elementy unikalne:

        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(9);
        values.add(11);

        System.out.println(returnUniQuElement(values));
    }

    public static List<Integer> returnUniQuElement(List<Integer> values) {

        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < uniqueList.size(); i++) {
            Integer currentElement = uniqueList.get(i);
            for (int j = i + 1; j < uniqueList.size(); j++) {
                if (currentElement.equals(uniqueList.get(j))) {
                    uniqueList.remove(j);

                }
            }
        }return uniqueList;
    }
}
