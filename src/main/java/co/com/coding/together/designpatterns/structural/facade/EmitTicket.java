package co.com.coding.together.designpatterns.structural.facade;

public class EmitTicket {

    public void emitTicket(String passenger, String origin, String destination, String date) {
        System.out.println("Emit ticket to passenger " + passenger + " from " + origin + " to  " + destination + " date " + date);
        //logic
    }
}
