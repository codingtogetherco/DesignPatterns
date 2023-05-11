package co.com.coding.together.designpatterns.behavioral.visitor;

import java.util.List;

public class ReportVisitor implements VisitorInsurance {


    @Override
    public String visitLifeInsurance(LifeInsurance lifeInsurance) {
        return "LifeInsurance Data";
    }

    @Override
    public String visitTheftInsurance(TheftInsurance theftInsurance) {
        return "TheftInsurance Data";
    }

    @Override
    public String visitRetirementInsurance(RetirementInsurance retirementInsurance) {
        return "RetirementInsurance Data";
    }

    public String getReport(List<InsuranceLogic> itemsList) {
        StringBuilder sb = new StringBuilder();
        itemsList.forEach(insurance -> {
            sb.append("\n");
            sb.append(insurance.accept(this));
            sb.append("\n");
        });
        return sb.toString();
    }
}
