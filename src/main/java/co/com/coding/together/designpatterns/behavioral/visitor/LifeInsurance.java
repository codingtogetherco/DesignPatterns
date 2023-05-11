package co.com.coding.together.designpatterns.behavioral.visitor;

public class LifeInsurance implements InsuranceLogic {


    @Override
    public void calculateInsurance() {

    }

    @Override
    public String accept(VisitorInsurance visitorInsurance) {
        return visitorInsurance.visitLifeInsurance(this);
    }

    // Old logic code

}
