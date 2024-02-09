package enumy.biblioteka;

import java.time.LocalDate;
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

    public Book(Status status, String title, String author, int yearOfPublication) {
        super(status);
        this.title = title;
        this.author = (showTimeOfPublishing(yearOfPublication) ? author.toUpperCase():author);
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean borrowItem(Book book) {
        Status status = super.getStatus();
        if (status == Status.AVAILABLE) {
            super.setStatus(Status.BORROWED);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnItem(Book book) {
        if (super.getStatus() == Status.BORROWED) {
            super.setStatus(Status.AVAILABLE);
            return true;
        }
        return false;
    }

    public boolean showTimeOfPublishing(int yearOfPublication) {
        int actuallyYear = LocalDate.now().getYear();
        if (yearOfPublication < actuallyYear - 5) {
            return true;
        }return false;
    }
}