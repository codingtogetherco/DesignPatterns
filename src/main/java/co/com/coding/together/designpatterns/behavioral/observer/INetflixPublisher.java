package co.com.coding.together.designpatterns.behavioral.observer;

import java.util.List;

public interface INetflixPublisher {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers();

    List<Subscriber> getSubscribers();

}
