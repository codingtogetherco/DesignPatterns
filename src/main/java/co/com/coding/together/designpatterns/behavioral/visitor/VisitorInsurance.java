package co.com.coding.together.designpatterns.behavioral.visitor;

public interface VisitorInsurance {

    String visitLifeInsurance(LifeInsurance lifeInsurance);

    String visitTheftInsurance(TheftInsurance theftInsurance);

    String visitRetirementInsurance(RetirementInsurance retirementInsurance);

}
