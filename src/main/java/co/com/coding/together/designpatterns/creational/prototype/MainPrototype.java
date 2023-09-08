package co.com.coding.together.designpatterns.creational.prototype;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        CreditCard prototypeCard = new CreditCard("John Doe", "1234-5678-9012-3456", "12/23", 123);
        CreditCard card1 = prototypeCard.clone();
        card1.setTitularName("Alice Smith");

        CreditCard card2 = prototypeCard.clone();
        card2.setTitularName("Bob Johnson");

        System.out.println("prototypeCard:" + prototypeCard.toString());

        System.out.println("Card 1:" + card1.toString());
        System.out.println("Card 1:" + card2.toString());

    }

}
