package CORPattern;

public abstract class CashWithdrawalHandler {

    CashWithdrawalHandler next;

    public CashWithdrawalHandler(CashWithdrawalHandler next) {
        this.next = next;
    }

    public void processCash(int amount) throws Exception{

        if(amount>0 && next==null){
            throw new Exception("Please enter a valid amount");
        }

        if(next!=null){
            next.processCash(amount);
        }

    }
}
