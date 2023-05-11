package co.com.coding.together.designpatterns.behavioral.visitor;

import co.com.coding.together.designpatterns.creational.factory.Paypal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class MainComponent implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        LifeInsurance lifeInsurance = new LifeInsurance();
        RetirementInsurance retirementInsurance = new RetirementInsurance();
        TheftInsurance theftInsurance = new TheftInsurance();

        List<InsuranceLogic> list = new ArrayList<>();
        list.add(lifeInsurance);
        list.add(retirementInsurance);
        list.add(theftInsurance);

        ReportVisitor reportVisitor = new ReportVisitor();
        log.info("VISITORS Report {}", reportVisitor.getReport(list));
    }

}
