package co.com.coding.together.designpatterns.behavioral.observer;


public class Subscriber1 implements Subscriber {

    @Override
    public void update(String newContent) {
        System.out.println("Netflix  has publish new content " + newContent);
    }
}
