package org.example;

import StatePattern.ATMMachineState;
import StatePattern.IdleState;

public class ATMMachine {

    ATMMachineState state;
    int balanceAmount;

    public ATMMachine(int i) {
        this.balanceAmount = i;
    }

    public ATMMachineState getState() {
        return state;
    }

    public void setState(ATMMachineState state) {
        this.state = state;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
}
