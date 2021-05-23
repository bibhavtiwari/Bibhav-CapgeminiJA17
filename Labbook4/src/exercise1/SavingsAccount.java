package exercise1;

public class SavingsAccount extends Account {

	final double minimum_balance=500;
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void withdraw(double amount) {
		if(balance>=minimum_balance)
			balance=balance-amount;
		else
			System.out.println("Cannot Withdraw...");
	}
}
