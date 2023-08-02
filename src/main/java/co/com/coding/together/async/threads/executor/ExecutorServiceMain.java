package co.com.coding.together.async.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(ExecutorServiceMain::myFirstTask);
        executor.submit(ExecutorServiceMain::mySecondTask);
        executor.shutdown();

    }

    public static void mySecondTask() {
        System.out.println("Running, mySecondTask!");
    }

    public static void myFirstTask () {
        try {
            Thread.sleep(5000);
            System.out.println("Running, myFirstTask!");
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}
