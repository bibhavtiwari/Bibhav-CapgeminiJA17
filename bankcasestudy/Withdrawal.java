package bankcasestudy;

public class Withdrawal extends Transaction {
private double amount;
public Withdrawal() {
	super();
}
public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public Withdrawal(int accountNumber ,double amount) {
	super.execute(accountNumber);
	this.amount = amount;
}

public void execute(double balance) {
	balance = balance -amount;
	System.out.println("Curent Balance"+balance);
}





}
