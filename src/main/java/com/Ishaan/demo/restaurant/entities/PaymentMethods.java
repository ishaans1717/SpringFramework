package com.Ishaan.demo.restaurant.entities;

public class PaymentMethods {
    private String cash;
    private String creditCards;
    private String debitCards;
    public String getCash(){return cash;}
    public void setCash(String cash){this.cash = cash;}
    public String getCreditCards(){return creditCards;}
    public void setCreditCards(String creditCards){this.creditCards = creditCards;}
    public String getDebitCards(){return debitCards;}
    public void setDebitCards(String debitCards){this.debitCards = debitCards;}
}
