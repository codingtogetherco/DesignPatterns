package co.com.coding.together.async.threads;

public class MainThreads2 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Thread thread = new Thread(new MyFirstTask());
        Thread thread2 = new Thread(new MySecondTask());
        thread.start();
        thread2.start();
    }

}