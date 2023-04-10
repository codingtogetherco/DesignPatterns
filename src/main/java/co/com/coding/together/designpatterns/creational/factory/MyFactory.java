package co.com.coding.together.designpatterns.creational.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Scope("prototype")
public class MyFactory {

    private final Map<String, PaymentMethods> myInterfaceMap;

    @Autowired
    private MyFactory(List<PaymentMethods> services) {
        myInterfaceMap = services.stream()
                .collect(Collectors.toMap(PaymentMethods::getClassIdentifier, Function.identity()));
    }

    public PaymentMethods getImplementation(String identifier) {
        return Optional.ofNullable(myInterfaceMap.get(identifier)).orElseThrow(IllegalArgumentException::new);
    }
}
