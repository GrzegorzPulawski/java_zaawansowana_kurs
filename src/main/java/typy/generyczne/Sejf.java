package typy.generyczne;

public class Sejf<T> {

    private String haslo;
    private T tajny;

    public Sejf(String haslo, T tajnyObiekt) {
        this.haslo = haslo;
        this.tajny = tajnyObiekt;
    }

    public T getObject(String podajHaslo) {
        if (this.haslo.equals(podajHaslo)) return this.tajny;

        return null;
    }
}


