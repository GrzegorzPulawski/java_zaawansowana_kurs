package programowanie.zadanie12;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {
    //Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj.
    // Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora.
    // Zaimplementuj metody hashCode() i equals().

    private String nazwa;
    private String rokZalozenia;
    private String kraj;

    public Manufacturer(String nazwa, String rokZalozenia, String kraj) {
        this.nazwa = nazwa;
        this.rokZalozenia = rokZalozenia;
        this.kraj = kraj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getRokZalozenia() {
        return rokZalozenia;
    }

    public void setRokZalozenia(String rokZalozenia) {
        this.rokZalozenia = rokZalozenia;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer that)) return false;
        return getNazwa().equals(that.getNazwa()) && getRokZalozenia().equals(that.getRokZalozenia()) && getKraj().equals(that.getKraj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNazwa(), getRokZalozenia(), getKraj());
    }
}
