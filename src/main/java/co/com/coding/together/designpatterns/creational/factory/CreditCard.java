package co.com.coding.together.designpatterns.creational.factory;

import org.springframework.stereotype.Component;
//CreditCard

@Component
public class CreditCard implements PaymentMethods {

    private final String CLASS_IDENTIFIER = "2";

    @Override
    public String getClassIdentifier() {
        return CLASS_IDENTIFIER;
    }

    @Override
    public void pay() {
        //pay
    }
}
