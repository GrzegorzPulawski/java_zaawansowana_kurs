package programowanie.zadanie36;
import java.lang.Runnable;
public class ThreadPlaygroundRunnable implements Runnable{
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name+ i + Thread.currentThread().getName());
        }
    }
}
