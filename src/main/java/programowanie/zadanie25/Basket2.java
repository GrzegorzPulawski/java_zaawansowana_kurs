package programowanie.zadanie25;

import java.util.ArrayList;
import java.util.List;

public class Basket2 {
    //Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku. Dodaj metodę
    // addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1) oraz metodę removeFromBasket(),
    // która usuwa element z koszyka (zmniejszając aktualny stan o 1).
    //Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie
    // 0 lub dodania przy stanie 10, rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
    private int count = 0;
    List<String> basketsList = new ArrayList<>();

    public Basket2() {

    }

    public void addToBasket(String element) throws BasketFullException {
        if (count < 3) {
            count += 1;
            basketsList.add(element);
        } else throw new BasketFullException();
    }

    public void removeFromBasket(String element) throws BasketEmptyException {
        if (count > 0) {
            count -= 1;
            basketsList.remove(element);
        } else throw new BasketEmptyException();
    }

    public class BasketFullException extends Exception {
    }

    public class BasketEmptyException extends Exception {
    }

}
