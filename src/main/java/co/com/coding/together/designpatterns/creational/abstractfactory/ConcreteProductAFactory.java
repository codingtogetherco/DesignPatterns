package co.com.coding.together.designpatterns.creational.abstractfactory;

//Concrete Factory for Desktop
public class ConcreteProductAFactory implements AbstractFactory {


    @Override
    public AbstractProduct createAbstractProduct() {
        return new ProductA();
    }
}
