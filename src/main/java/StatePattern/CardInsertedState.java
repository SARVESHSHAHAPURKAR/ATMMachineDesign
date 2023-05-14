package StatePattern;

import org.example.ATMMachine;
import org.example.User;

public class CardInsertedState implements ATMMachineState{


    @Override
    public void insertCard(ATMMachine machine) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public void authenticateUser(ATMMachine machine, User user, String pin) throws Exception {
        if(user.getCard().getPin().equals(pin)){
            machine.setState(new AuthenticatedState());
        }
        else{
            throw new Exception("Incorrect PIN");
        }
    }

    @Override
    public void exit(ATMMachine machine) throws Exception {
        machine.setState(new IdleState());
    }

    @Override
    public int checkBalance(ATMMachine machine, User user) throws Exception {
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
        throw new Exception("Operation invalid at this stage");
    }
}
