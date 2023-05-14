package StatePattern;

import org.example.ATMMachine;
import org.example.User;

public class AuthenticatedState implements ATMMachineState{


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

    }

    @Override
    public int checkBalance(ATMMachine machine, User user) throws Exception {
        machine.setState(new CheckBalanceState(user));
        return 0;
    }

    @Override
    public void showStatement(ATMMachine machine, User user) throws Exception {
        throw new Exception("Operation invalid at this stage");
    }

    @Override
    public int withdrawCash(ATMMachine machine, User user, int amount) throws Exception {
        machine.setState(new CashWithdrawalState(user, amount));
        return 0;
    }

    @Override
    public void setPin(ATMMachine machine, User user, String pin) throws Exception {
        user.getCard().setPin(pin);
        machine.setState(new ChangePinState(user));
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
