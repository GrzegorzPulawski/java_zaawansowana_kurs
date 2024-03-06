package programowanie.zadanie34;
import java.lang.Thread;
public class MyThread extends Thread{
    //Utwórz klasę rozszerzającą klasę Thread np. MyThread, przeciąż metodę run(),
    // w której wyświetlisz w konsoli nazwę wątku odczytując ją ze statycznej metody aktualnego wątku:
    //Thread.currentThread().getName()
    @Override
    public void run(){
        System.out.println("Nazwa wątku " +Thread.currentThread().getName() );
    }
}
