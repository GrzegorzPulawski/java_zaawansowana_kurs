package enumy.biblioteka;

import java.util.Date;

public class Book extends LibraryItem implements Borrowable {
    //Klasa (class) - Klasa Book reprezentująca książkę w bibliotece.
    // Powinna zawierać przynajmniej tytuł, autora i rok wydania jako pola klasy.
    //Book (Klasa)
    //Dziedziczy po LibraryItem i implementuje Borrowable.
    //Pola klasy: title, author, yearPublished powinny być prywatne.
    //Zaimplementuj konstruktor przyjmujący wszystkie wartości jako parametry oraz gettery dla tych pól.
    //Zaimplementuj metody z interfejsu Borrowable.
    //Stwórz metodę prywatną, która zwróci informację czy książka jest starsza niż 5 lat.
    // Jeśli podczas tworzenia instancji książka jest starsza niż 5 lat, pole author powinno
    // być napisane z dużych liter.

    private String title;
    private String author;
    private int yearOfPublication;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean borrowItem(Book book) {
        Status status = super.getStatus();
        if (status == Status.AVAILABLE) {
            return true;
        }
        return false;
    }
    @Override
    public boolean returnItem(Book book) {
        Status status1 = super.getStatus();
        if (status1 == Status.BORROWED){
            return true;
        }
        return false;
    }

    public void showTimeOfPublishing(int yearOfPublication ) {
        if(yearOfPublication >5){
            System.out.println("Książka jest starsza niz 5 lat)");
            System.out.println(getAuthor().toUpperCase());
        }
    }
}