package co.com.coding.together.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AbstractFactoryComponent implements CommandLineRunner {

    @Override
    public void run(String...args) throws Exception {

//        AbstractProduct productA = AbstractProductFactory.getProduct(new ConcreteProductAFactory());
//        AbstractProduct productB = AbstractProductFactory.getProduct(new ConcreteProductBFactory());
//        log.info("Method for product A Config {}", productA.commonMethod());
//        log.info("Method for product B Config {}", productB.commonMethod());

        AbstractProduct productA = AbstractProductFactory.getProductById("productA");
        AbstractProduct productB = AbstractProductFactory.getProductById("productB");
        log.info("Method for product A Config {}", productA.commonMethod());
        log.info("Method for product B Config {}", productB.commonMethod());

    }

}
