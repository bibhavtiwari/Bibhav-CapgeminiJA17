package payrollcasestudy;
import java.util.Scanner;
public class Main {
public static void adminarea() {
	Scanner sc =new Scanner(System.in);
	Admin ad=new Admin();
	System.out.println("Enter Name");
	String name = sc.nextLine();
	System.out.println("Enter Salary");
	int salary = sc.nextInt();
	ad.adjustSalary(salary);
	ad.doAdminStuff();
	
	
}
public static void acadarea() {
	Scanner sc =new Scanner(System.in);
	Academics ac=new Academics();
	System.out.println("Enter Name");
	String name = sc.nextLine();
	System.out.println("Enter Salary");
	int salary = sc.nextInt();
	ac.adjustSalary(salary);
	ac.givelecture();
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Choice:\n1.Admin\n2Academics");
int ch =sc.nextInt();
if (ch==1)
{ adminarea();
	}
else
{
	acadarea();}
	
	}

}
