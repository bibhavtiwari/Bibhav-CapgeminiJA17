package payrollcasestudy;

public class Academics extends Payroll {
	private String name;
	private int salary;
Academics(){}	
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

public Academics(String name, int salary) {
		super.adjustSalary(salary);
		this.name = name;
		this.salary = salary;
	}

public void givelecture() {
	System.out.println("Lecture given");
}
}
