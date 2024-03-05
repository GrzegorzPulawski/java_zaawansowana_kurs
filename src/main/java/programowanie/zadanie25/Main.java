package programowanie.zadanie25;



public class Main {
    public static void main(String[] args) throws Basket2.BasketFullException, Basket2.BasketEmptyException {
        Basket2 basket = new Basket2();

        basket.addToBasket("Masło");
        basket.addToBasket("Chleb");
        basket.addToBasket("Woda");
       // basket.addToBasket("Fajki");
        basket.removeFromBasket("Woda");
        basket.removeFromBasket("Chleb");
        basket.removeFromBasket("Masło");
        //basket.removeFromBasket("Coś");
    }
}
