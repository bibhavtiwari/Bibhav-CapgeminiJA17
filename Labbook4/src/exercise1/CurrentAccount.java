package exercise1;

public class CurrentAccount extends Account {

	public CurrentAccount(long accNumber, double balance, Person accHolder) {
		super(accNumber, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	double overdraft_limit=90;
	
	@Override
	public void deposit(double amount) {
		if(balance+amount>overdraft_limit) 
			System.out.println("Cannot deposit...");
		else
			balance=balance+amount;
	}
}
