package co.com.coding.together.designpatterns.structural.facade;

public class AvailabilityFlight {

    public boolean verifyAvailability(String origin, String destination, String date) {
        System.out.println("Checking availability for flight  from " + origin + " to  " + destination + " date " + date);
        //logic
        return true;
    }
}
