package bankcasestudy;

public class BalanceInquiry extends Transaction{
public BalanceInquiry() {
	super();
}
	public BalanceInquiry(int accountNumber,double balance) {
		super.execute(accountNumber);
	}
	public void execute(double balance) {
	
		System.out.println("Current Balance is"+balance);
	}

}
