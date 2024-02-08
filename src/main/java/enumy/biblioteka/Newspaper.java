package enumy.biblioteka;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Newspaper extends LibraryItem{
    //Klasa (class) - Klasa NewsPaper reprezentująca gazetę. Powinna zawierać datę wydania i wydawnictwo.
    //NewsPaper (Klasa)
    //Dziedziczy po LibraryItem
    //Pola klasy: data wydania (typ związany z datą), wydawnictwo.
    //Zaimplementuj prywatny konstruktor.
    private String publishingHouse;
    private Date dateOfPrint;

    private Newspaper(String publishingHouse, Date dateOfPrint) {
        this.publishingHouse = publishingHouse;
        this.dateOfPrint = dateOfPrint;
    }
}
