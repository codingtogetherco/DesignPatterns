package co.com.coding.together.designpatterns.behavioral.visitor;

public interface InsuranceLogic {


    void calculateInsurance();

    String accept(VisitorInsurance visitorInsurance);


}
