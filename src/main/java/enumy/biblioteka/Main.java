package enumy.biblioteka;

public class Main {
    public static void main(String[] args) {

        //Zaprojektuj aplikację w języku Java, która symuluje prosty system zarządzania biblioteką.
        // System powinien pozwolić na dodawanie książek do katalogu, sprawdzanie dostępności i wypożyczanie książek.
        //Stwórz klasę main w której zaprezentujesz działanie biblioteki,
        // tzn. wypożyczanie książki, zwracanie informacji że jest już wypożyczona, zwroty, sposób zapisania tytułu.

        Book book = new Book(Status.AVAILABLE, "Nieznosna lekkość bytu ", "Kundera", 1984);
        book.borrowItem(book);
        printStatus(book);

        printInfo(book);

        book.returnItem(book);
        printStatus(book);
    }

    public static void printStatus(Book book) {
        System.out.println("Status książki: " + book.getTitle() + "jest " + book.getStatus().getPoPolsku());
    }

    public static void printInfo(Book book) {
        System.out.println("Tytuł ksiązki: " + book.getTitle() + " Autor: " + book.getAuthor() + " Rok wydania: " + book.getYearOfPublication());
    }

}


