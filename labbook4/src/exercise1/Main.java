package exercise1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("Smith",25.0f);
		Person person1=new Person("Kathy",44.0f);
		Account account=new Account((long)(Math.random()*Math.pow(10,16)),2000,person);
		Account account1=new Account((long)(Math.random()*Math.pow(10,16)),3000,person1);
		System.out.println("Account No.\tAccount Holder\t\tIntial Balance");
		System.out.println(person.name+"\t\t"+account.accNumber+"\t"+account.balance);
		System.out.println(person1.name+"\t\t"+account1.accNumber+"\t"+account1.balance);
		
		account.deposit(2000);
		account1.withdraw(2000);
		
		System.out.println();
		System.out.println("Account No.\tAccount Holder\t\tIntial Balance");
		System.out.println(person.name+"\t\t"+account.accNumber+"\t"+account.balance);
		System.out.println(person1.name+"\t\t"+account1.accNumber+"\t"+account1.balance);
	}

}
