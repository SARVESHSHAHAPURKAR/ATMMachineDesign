package org.example;

public class Card {

    CardType cardType;
    String pin;

    public Card(CardType visa, String s) {
        this.cardType = visa;
        this.pin=s;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
