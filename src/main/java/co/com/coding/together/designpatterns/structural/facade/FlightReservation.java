package co.com.coding.together.designpatterns.structural.facade;

public class FlightReservation {

    public void bookFlight(String origin, String destination, String date) {
        System.out.println("Booking flight  from " + origin + " to  " + destination + " date " + date);
        //logic
    }
}
