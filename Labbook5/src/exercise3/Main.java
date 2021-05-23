package exercise3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter Employee ID : ");
			int id=sc.nextInt();
			System.out.print("Enter Employee Name : ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Enter Employee Age : ");
			int age=sc.nextInt();
			System.out.print("Enter Employee Salary : ");
			double salary=sc.nextDouble();
			Employee e = new Employee(id,name,age,salary);
			e.validateSalary(salary);
		}catch(EmployeeException e) {
			System.out.println("Invalid Message : "+e.getMessage());
		}
		sc.close();
	}
}
