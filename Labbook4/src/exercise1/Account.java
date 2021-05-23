package exercise1;

public class Account {
		long accNumber;
		double balance;
		Person accHolder;
		
		public Account(long accNum,double balance,Person accHolder) {
			this.accNumber = accNum;
			this.balance = balance;
			this.accHolder = accHolder;
		}

		public long getAccNumber() {
			return accNumber;
		}

		public void setAccNumber(long accNumber) {
			this.accNumber = accNumber;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public Person getAccHolder() {
			return accHolder;
		}

		public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
		}
		public void deposit(double amount) {
			balance=balance+amount;
		}
		
		public void withdraw(double amount) {
			balance=balance-amount;
		}

}
