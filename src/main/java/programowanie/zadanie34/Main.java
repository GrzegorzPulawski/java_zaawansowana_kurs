package programowanie.zadanie34;

public class Main {
    public static void main(String[] args) {
        //Utwórz klasę z metodą public static void main(String[] args). Wewnątrz metody main utwórz zmienną typu naszej
        // klasy stworzonej powyżej np. MyThread oraz zainicjuj klasę. Na zmiennej wykonać metodę start().

        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

    }
}
