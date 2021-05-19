package payrollcasestudy;

public class Admin extends Payroll {
	private String name;
	private int salary;
	
Admin(){}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Admin(String name, int salary) {
		super.adjustSalary(salary);
		this.name = name;
		this.salary = salary;
	}


	public void doAdminStuff() {
		System.out.println("Admin");
	}
}
