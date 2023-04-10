package co.com.coding.together.designpatterns.creational.abstractfactory;

//Concrete Factory for Laptop
public class ConcreteProductBFactory implements AbstractFactory {

    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductB();
    }
}