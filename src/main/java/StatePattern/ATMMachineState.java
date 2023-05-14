package StatePattern;

import org.example.ATMMachine;
import org.example.User;

public interface ATMMachineState {

    void insertCard(ATMMachine machine) throws Exception;

    void authenticateUser(ATMMachine machine, User user, String pin) throws Exception;

    void exit(ATMMachine machine) throws Exception;

    int checkBalance(ATMMachine machine, User user) throws Exception;

    void showStatement(ATMMachine machine, User user) throws Exception;

    int withdrawCash(ATMMachine machine, User user, int amount) throws Exception;

    void setPin(ATMMachine machine, User user, String pin) throws Exception;

    void printStatement(ATMMachine machine, User user) throws Exception;

    int dispenseCash(ATMMachine machine) throws Exception;
}
