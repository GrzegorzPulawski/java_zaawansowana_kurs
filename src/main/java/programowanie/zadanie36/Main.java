package programowanie.zadanie36;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {


        ThreadPlaygroundRunnable threadPlaygroundRunnable1 = new ThreadPlaygroundRunnable("Nazwa: ");
        ThreadPlaygroundRunnable threadPlaygroundRunnable2 = new ThreadPlaygroundRunnable("Nazwa: ");
        pole1 = new Thread(threadPlaygroundRunnable1);
        pole2 = new Thread(threadPlaygroundRunnable1);
      //  pole1.start();
      //  pole2.start();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            ThreadPlaygroundRunnable runnable = new ThreadPlaygroundRunnable("CosTam " + i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }

    private static Thread pole1;
    private static  Thread pole2;

}
