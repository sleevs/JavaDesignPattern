package br.com.jsn.model;

public class Card {



    private String cardType ;
    private String number ;
    private String validate ;
    private String securityNumber ;
    private String passwordCard ;

    public Card(){}

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public String getPasswordCard() {
        return passwordCard;
    }

    public void setPasswordCard(String passwordCard) {
        this.passwordCard = passwordCard;
    }
}
