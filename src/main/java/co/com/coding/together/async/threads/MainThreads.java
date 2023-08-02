package co.com.coding.together.async.threads;

public class MainThreads {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Thread thread = new Thread(MainThreads::myFirstTask);
        Thread thread2 = new Thread(MainThreads::mySecondTask);
        thread.start();
        thread2.start();
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