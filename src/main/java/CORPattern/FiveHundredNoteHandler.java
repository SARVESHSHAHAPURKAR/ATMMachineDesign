package CORPattern;

public class FiveHundredNoteHandler extends CashWithdrawalHandler{


    public FiveHundredNoteHandler(CashWithdrawalHandler next) {
        super(next);
    }

    public void processCash(int amount) throws Exception {

        if(amount==0){
            return;
        }

        int k= amount/500;
        amount -= k*500;

        super.processCash(amount);
        System.out.println(k+" notes of 500 dispensed");

    }
}
