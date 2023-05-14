package CORPattern;

public class TwoHundredNoteHandler extends CashWithdrawalHandler{

    public TwoHundredNoteHandler(CashWithdrawalHandler next) {
        super(next);
    }

    public void processCash(int amount) throws Exception {

        if(amount==0){
            return;
        }

        int k= amount/200;
        amount -= k*200;

        super.processCash(amount);
        System.out.println(k+" notes of 200 dispensed");

    }
}
