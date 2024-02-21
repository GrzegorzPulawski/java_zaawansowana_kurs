package stream.przyklad;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            System.out.println("nie jest null");
        }

        // optional, jak zmienna powyżej, przechowuję jakąs instancję, kod ponżej aktywuję funkcje
        // z argumentu jeśli obiekt w Optional nie jest null
        Optional.empty().ifPresent(a -> System.out.println("nie jest null"));


        List<String> x = List.of("1", "100", "200");
        String element1 = x.stream().filter(a -> a.length() > 1).findAny().get(); // findAny znajdzie dowolny obiekt ze Streamu a get() na Optional zwróci zawartość optionala w tym null
        String element2 = x.stream().filter(a -> a.length() > 1).findAny().orElseGet(() -> "wartość alternatywna"); // orElseGet aktywuje funkcje produkującą alternatywną wartość jest wartość Optional jest null
        String element3 = x.stream().filter(a -> a.length() > 1).findAny().orElse("wartość alternatywna"); // orElse zwróci alternatywną podaną wartość jeśli wartość w Optional jest null
        x.stream().filter(a -> a.length() > 1).findAny().ifPresent(a -> System.out.println("tak, znaleziono element")); // ifPresent wywoła podaną w arg funkcję jeśli wartość w Optional nie jest null

        // String::length | System.out::println - alternatywne zapisy do map i peek
        boolean result = x.stream() // otwieram Stream na liście x
                .map(ele -> ele.length()) // map zamienia obiekty w Streamie na inne, w tym przypadku Integery brane z wielkości każdego elementu String
                .peek(a -> System.out.println(a)) // peek wywołuje funkcję na każdym z elementów streama, nie modyfikuje Streamu
                .limit(2) // limit przepuści dalej w Streamie tylko liczbę elementów z argumentu
                .sorted() // sorted posortuje elementy w Streamie
                .anyMatch(element -> element % 2 == 0); // anyMatch sprawdzi czy którykolwiek element w Streamie spełnia warunek z funkcji i zwraca wartość logiczną true/false
        //.allMatch(element -> element % 2 == 0); // allMatch sprawdza czy wszystkie elementy spełaniają warunek

        int max_length_string = x.stream().mapToInt(ele -> ele.length()).max().orElse(0); // mapToInt daje Stream zorientowany na Int'y z dodatkowymi metodami dla liczb
        // .max() .min() .average() .sum() - wartość maksymalna w streamie, minimalna, policzona średnia, policzona suma z elementów
    }
}