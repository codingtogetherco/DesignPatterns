package co.com.coding.together.designpatterns.structural.facade;

public class ManagerFlightsFacade {

    private FlightReservation flightReservation;
    private AvailabilityFlight availabilityFlight;
    private EmitTicket emitTicket;


    public ManagerFlightsFacade() {
        flightReservation = new FlightReservation();
        availabilityFlight = new AvailabilityFlight();
        emitTicket = new EmitTicket();
    }

    public void bookFlight(String passenger, String origin, String destination, String date) {
        if (availabilityFlight.verifyAvailability(origin, destination, date)) {
            flightReservation.bookFlight(origin, destination, date);
            emitTicket.emitTicket(passenger, origin, destination, date);
        } else {
            System.out.println("Sorry, there is no availability for the selected flight.");
        }
    }
}
