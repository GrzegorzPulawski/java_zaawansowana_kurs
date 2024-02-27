package programowanie.zadanie3;

import java.util.Map;

public class Main {
    //Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba,
    // a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "".
    // Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
    //Przykład:
    //Klucz: Java, Wartość: 18,
    //Klucz: Python, Wartość: 1,
    //…
    //Klucz: PHP, Wartość: 0.
    //Bonus:
    //Napisz aby metoda działała niezależnie od typów w Mapie.
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Java", 18, "Python", 1, "PHP", 0);
        printElements(map);

    }
    public static <V,K> void printElements(Map<V,K> map){
        int count = 0;
        for (Map.Entry<V,K> entry:map.entrySet()){
            System.out.println("Klucz: "+ entry.getKey() + " "+"Wartośc: "+ entry.getValue());
            count++;
            if (count < map.size()) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
            System.out.println();

        }
    }
}
