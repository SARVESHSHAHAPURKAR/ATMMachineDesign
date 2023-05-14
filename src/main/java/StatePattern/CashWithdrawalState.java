package StatePattern;

import CORPattern.*;
import org.example.ATMMachine;
import org.example.User;

public class CashWithdrawalState implements ATMMachineState{

    User user;
    int amount;

    CashWithdrawalHandler cashHandler = new TwoThousandNoteHandler(new FiveHundredNoteHandler(new TwoHundredNoteHandler(new HundredNoteHandler(null))));


    public CashWithdrawalState(User user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void insertCard(ATMMachine machine) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public void authenticateUser(ATMMachine machine, User user, String pin) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public void exit(ATMMachine machine) throws Exception {
        machine.setState(new IdleState());
    }

    @Override
    public int checkBalance(ATMMachine machine, User user) throws Exception{
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public void showStatement(ATMMachine machine, User user) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public int withdrawCash(ATMMachine machine, User user, int amount) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public void setPin(ATMMachine machine, User user, String pin) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public void printStatement(ATMMachine machine, User user) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public int dispenseCash(ATMMachine machine) throws Exception {

        if(user.getBankAccount().getBalance()<amount){
            throw new Exception("Insufficient balance in your account");
        }
        if(machine.getBalanceAmount()<amount){
            throw new Exception("Insufficient cash in machine");
        }

        try {
            cashHandler.processCash(amount);
            machine.setBalanceAmount(machine.getBalanceAmount() - amount);
            user.getBankAccount().setBalance(user.getBankAccount().getBalance() - amount);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Your balance is " + user.getBankAccount().getBalance());
        }

        return 0;
    }
}
