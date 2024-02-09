package enumy.biblioteka;

public  abstract class LibraryItem {
    //Klasa abstrakcyjna (abstract class) - Klasa abstrakcyjna LibraryItem służąca jako
    // bazowa klasa dla różnych typów przedmiotów w bibliotece, np. książek, magazynów itp.
    //LibraryItem (Klasa abstrakcyjna)
    //Zadeklaruj jako publiczną.
    //Powinna zawierać przynajmniej jedno pole status typu Status z modyfikatorem dostępu private.
    //Zdefiniuj konstruktor oraz gettery i settery dla pola status.

    private Status status;

    public LibraryItem(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }
}
