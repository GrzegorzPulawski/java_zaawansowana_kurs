package enumy.biblioteka;

public enum Status {
    //Wyliczenie (enum) - Typ wyliczeniowy Status
    // z wartościami AVAILABLE, BORROWED, RESERVED określającymi status przedmiotu bibliotecznego.
    //Status (Enum)
    //Zadeklaruj jako publiczny.
    //Definiuje status przedmiotu (dostępny, wypożyczony, zarezerwowany).
    // Dodaj pole z tłumaczeniem wartości na język polski.
    AVAILABLE("dostepny"),
    BORROWED("wypozyczony"),
    RESERVED("zarezerwowany");
    String poPolsku;

      private Status(String poPolsku) {
        this.poPolsku = poPolsku;
    }
}

