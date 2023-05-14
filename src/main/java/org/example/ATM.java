package org.example;

public class ATM {

    ATMMachine machine;

    User user;

    public ATM(ATMMachine machine, User user) {
        this.machine = machine;
        this.user = user;
    }

    public ATMMachine getMachine() {
        return machine;
    }

    public void setMachine(ATMMachine machine) {
        this.machine = machine;
    }
}
