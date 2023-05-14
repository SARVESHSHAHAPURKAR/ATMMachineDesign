package CORPattern;

public class HundredNoteHandler extends CashWithdrawalHandler{


    public HundredNoteHandler(CashWithdrawalHandler next) {
        super(next);
    }

    public void processCash(int amount) throws Exception {



        if(amount==0){
            return;
        }

        int k= amount/100;
        amount -= k*100;

        super.processCash(amount);
        System.out.println(k+" notes of 100 dispensed");

    }
}
