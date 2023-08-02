package co.com.coding.together.async.threads;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        myFirstTask();
        mySecondTask();
    }

    public static void myFirstTask() {
        System.out.println("Running, myFirstTask!");
    }

    public static void mySecondTask() {
        System.out.println("Running, mySecondTask!");
    }
}