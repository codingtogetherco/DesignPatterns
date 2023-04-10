package co.com.coding.together.designpatterns.creational.abstractfactory;

public class AbstractProductFactory {

    public static AbstractProduct getProduct(AbstractFactory factory){
        return factory.createAbstractProduct();
    }

    public static AbstractProduct getProductById(String id){
        if("productA".equals(id)) {
            return new ConcreteProductAFactory().createAbstractProduct();
        } else {
            return new ConcreteProductBFactory().createAbstractProduct();

        }
    }
}
