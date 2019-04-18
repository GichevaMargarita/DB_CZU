package com.czu.gicheva.classes;

public class Payment {
    private Integer amount;
    private String currency;
    private String transactionDate;
    private String cardNumber;

    public Payment(Integer amount, String currency, String transactionDate, String cardNumber) {
        this.amount = amount;
        this.currency = currency;
        this.transactionDate = transactionDate;
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
