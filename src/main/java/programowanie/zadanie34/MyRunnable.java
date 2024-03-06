package programowanie.zadanie34;
import java.lang.Runnable;
public class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("Nazwa wątku " + java.lang.Thread.currentThread().getName() );

    }

}
