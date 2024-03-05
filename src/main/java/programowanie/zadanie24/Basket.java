package programowanie.zadanie24;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    //Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku. Dodaj metodę
    // addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1) oraz metodę removeFromBasket(),
    // która usuwa element z koszyka (zmniejszając aktualny stan o 1).
    //Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie
    // 0 lub dodania przy stanie 10, rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
   // private int count=0;
    List<String> basketsList = new ArrayList<>();

    public Basket() {

    }

    public void addToBasket(String element) {
        if (basketsList.size()<3) {
           // count+=1;
            basketsList.add(element);
        } else throw new BasketFullException();
    }

    public void removeFromBasket(String element) {
        if (basketsList.size() > 0) {
          //  count-=1;
            basketsList.remove(element);
        }else throw new BasketEmptyException();
    }
    public class BasketFullException extends RuntimeException {
    }

    public class BasketEmptyException extends RuntimeException {
    }

}
