package programowanie.zadanie7;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    //Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.


    private int size;
    public List<String> ammoList;

    public Weapon(int size) {
        this.size = size;
        this.ammoList = new ArrayList<>();
    }


    //loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
    public void loadBullet(String bullet) {

        if (ammoList.size()  < this.size) {
            ammoList.add(bullet);
            System.out.println("Dodano" + bullet+ "do magazynka");
        }else {
            System.out.println("Magazynek jest pełny");
        }
    }
    //isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie

    //shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden -
    // ostatni załadowany nabój i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”

}
