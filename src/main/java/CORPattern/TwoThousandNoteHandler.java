package CORPattern;

public class TwoThousandNoteHandler extends CashWithdrawalHandler {


    public TwoThousandNoteHandler(CashWithdrawalHandler next) {
        super(next);
    }

    public void processCash(int amount) throws Exception {

        if(amount==0){
            return;
        }

        int k = amount/2000;
        amount -= k*2000;

        super.processCash(amount);
        System.out.println(k+" notes of 2000 dispensed");

    }
}
