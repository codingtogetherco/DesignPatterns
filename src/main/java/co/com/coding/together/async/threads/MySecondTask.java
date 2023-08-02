package co.com.coding.together.async.threads;

public class MySecondTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Running, mySecondTask!");
    }
}
