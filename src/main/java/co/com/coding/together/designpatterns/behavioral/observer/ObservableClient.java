package co.com.coding.together.designpatterns.behavioral.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ObservableClient implements CommandLineRunner {

    INetflixPublisher netflixPublisher;

    @Autowired
    public ObservableClient(NetflixPublisher netflixPublisher) {
        this.netflixPublisher = netflixPublisher;
    }

    @Override
    public void run(String...args) throws Exception {
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();
        netflixPublisher.addSubscriber(subscriber1);
        netflixPublisher.addSubscriber(subscriber2);
        log.info("netflixPublisher has  {} subscribers", netflixPublisher.getSubscribers().size());
        netflixPublisher.notifySubscribers();

    }

}
