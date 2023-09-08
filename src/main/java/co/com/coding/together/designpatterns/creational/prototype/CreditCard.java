package co.com.coding.together.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class CreditCard implements Cloneable  {

    private String titularName;
    private String cardId;
    private String dueDate;
    private int securityCode;

    public CreditCard(String titularName, String cardId, String dueDate, int securityCode) {
        this.titularName = titularName;
        this.cardId = cardId;
        this.dueDate = dueDate;
        this.securityCode = securityCode;
    }

    @Override
    protected CreditCard clone() throws CloneNotSupportedException {
        return (CreditCard) super.clone();

    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "titularName='" + titularName + '\'' +
                ", cardId='" + cardId + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", securityCode=" + securityCode +
                '}';
    }
}
