package co.com.coding.together.designpatterns.creational.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FactoryComponent implements CommandLineRunner {
    private final MyFactory factory;

    @Autowired
    public FactoryComponent(MyFactory factory) {
        this.factory = factory;
    }

    @Override
    public void run(String...args) throws Exception {
        PaymentMethods implementation = factory.getImplementation("2");
        log.info("Factory - Is MyFirstImplementation implementation? {}", implementation instanceof Paypal);
    }
}
