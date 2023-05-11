package co.com.coding.together.designpatterns.behavioral.visitor;

public class TheftInsurance implements InsuranceLogic {
    @Override
    public void calculateInsurance() {

    }

    @Override
    public String accept(VisitorInsurance visitorInsurance) {
        return visitorInsurance.visitTheftInsurance(this);
    }
}
