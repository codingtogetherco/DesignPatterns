package co.com.coding.together.designpatterns.creational.factory;

import org.springframework.stereotype.Component;

//Paypal
@Component
public class Paypal implements PaymentMethods {


    private final String CLASS_IDENTIFIER = "1";

    @Override
    public String getClassIdentifier() {
        return CLASS_IDENTIFIER;
    }

    @Override
    public void pay() {
//pay
    }
}
