package org.example;

import StatePattern.ATMMachineState;
import StatePattern.IdleState;

public class Main {


    public static void main(String[] args) throws Exception {

        //INITIALIZATION

        ATMMachineState state = new IdleState();
        ATMMachine atmMachine = new ATMMachine(500000);
        Card card = new Card(CardType.VISA, "1001");
        BankDetails bankDetails = new BankDetails("IFSC1234");
        BankAccount bankAccount = new BankAccount(bankDetails, "1234", 70000);

        User user = new User(card,bankAccount,"Sarvesh");
        ATM atm = new ATM(atmMachine,user);

        // CASH WITHDRAWAL FLOW

        state.insertCard(atmMachine);
        state = atmMachine.getState();

        state.authenticateUser(atmMachine,user,"1001");
        state = atmMachine.getState();

        state.withdrawCash(atmMachine,user,6300);
        state = atmMachine.getState();

        state.dispenseCash(atmMachine);

        state.exit(atmMachine);
        state = atmMachine.getState();

        // CHECK BALANCE FLOW

        state.insertCard(atmMachine);
        state = atmMachine.getState();

        state.authenticateUser(atmMachine,user,"1001");
        state = atmMachine.getState();

        state.checkBalance(atmMachine,user);
        state=atmMachine.getState();

        state.exit(atmMachine);

        state = atmMachine.getState();

        // PIN CHANGE FLOW

        state.insertCard(atmMachine);
        state = atmMachine.getState();

        state.authenticateUser(atmMachine,user,"1001");
        state = atmMachine.getState();

        state.setPin(atmMachine,user,"2002");
        System.out.println("New pin is "+user.getCard().getPin());
        state = atmMachine.getState();

        state.exit(atmMachine);
        state= atmMachine.getState();

        // CASH WITHDRAWAL FLOW

        state.insertCard(atmMachine);
        state = atmMachine.getState();

        state.authenticateUser(atmMachine,user,"2002");
        state = atmMachine.getState();

        state.withdrawCash(atmMachine,user, 5800);

        state = atmMachine.getState();

        state.dispenseCash(atmMachine);




    }
}