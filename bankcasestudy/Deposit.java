package bankcasestudy;

public class Deposit extends Transaction {
	private double amount;
public Deposit(){
	super();
}
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
public Deposit(int accountNumber, double amount) {
	super.execute(accountNumber);
	this.amount=amount;
}
public void execute(double balance) {
	balance = balance +amount;
	System.out.println("Current Balance is"+balance);
}
}
