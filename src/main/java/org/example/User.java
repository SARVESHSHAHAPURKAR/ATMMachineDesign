package org.example;

public class User {

    Card card;
    BankAccount bankAccount;
    String name;

    public User(Card card, BankAccount bankAccount, String name) {
        this.card = card;
        this.bankAccount = bankAccount;
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
