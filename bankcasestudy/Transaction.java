package bankcasestudy;

public class Transaction {
	private int accountNumber;
	

	public Transaction() {
		super();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Transaction(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void execute(int accountNumber) {
		System.out.println("Account number is " +accountNumber);
		
	}

}
