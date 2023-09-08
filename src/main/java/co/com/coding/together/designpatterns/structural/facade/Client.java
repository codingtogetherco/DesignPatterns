package co.com.coding.together.designpatterns.structural.facade;

public class Client {
    public static void main(String[] args) {
        ManagerFlightsFacade managerFlights = new ManagerFlightsFacade();
        managerFlights.bookFlight("Juan Pérez", "City A", "City B", "2023-09-10");


    }
}
