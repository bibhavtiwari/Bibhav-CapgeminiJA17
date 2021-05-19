package bankcasestudy;

import java.util.Scanner;

public class MainTransaction {

public static void BalanceTranc(int accountNumber,double balance) {
	BalanceInquiry bi = new BalanceInquiry(accountNumber,balance);
	bi.execute(balance);
	
}
public static void WithdrawalTranc(int accountNumber,double balance) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the withdraw amount");
	double amount = sc.nextDouble();
	Withdrawal wd = new Withdrawal(accountNumber,amount);
	wd.execute(balance);	
}
public static void DepositTranc(int accountNumber,double balance) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the deposit amount");
	double amount = sc.nextDouble();
	Deposit dp = new Deposit(accountNumber,amount);
	dp.execute(balance);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		System.out.println("Enter Current Balance");
		double balance= sc.nextDouble();
		System.out.println("Enter choice");
		char ch=' ';
		int choice;
			System.out.println("1. Check Balance\n2. Withdraw Money\n3. Deposit Money\nEnter your choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1: BalanceTranc(accountNumber,balance);
					break;
			case 2: WithdrawalTranc( accountNumber, balance);
					break;
			case 3: DepositTranc(accountNumber,balance);
					break;
			default: System.out.println("Enter correct choice (1-3)...");
		}
	}
}
		
