package co.com.coding.together.async.threads;

public class MyFirstTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Running, myFirstTask!");
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}
