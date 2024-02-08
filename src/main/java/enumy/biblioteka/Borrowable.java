package enumy.biblioteka;

public interface Borrowable {
    //Interfejs (interface) - Interfejs Borrowable z metodami umożliwiającymi wypożyczenie i zwrot przedmiotu.
    // Powinien zawierać metody borrowItem() i returnItem().
    //Borrowable (Interfejs)
    //Zdefiniuj jako publiczny.
    //Metody borrowItem() i returnItem() niech zwracają boolean - true jeśli operacja się powiodła,
    // false w przeciwnym razie tzn. czy książka nie jest już wypożyczona.

    boolean borrowItem(Book book);
    boolean returnItem(Book book);
}
