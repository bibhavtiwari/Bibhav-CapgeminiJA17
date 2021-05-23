package com.cg.eis.service;
import com.cg.eis.bean.Employee;
import java.util.Scanner;

interface EmployeeService{
	void getEmpDetails();
	void displayEmpDetails();
}
public class EmployeeServiceClass extends Employee implements EmployeeService {
Employee e=new Employee(); 
	
	public void getEmpDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		e.id=sc.nextInt();
		System.out.println("Enter name : ");
		e.Name=sc.next();
		System.out.println("Enter salary : ");
		e.Salary=sc.nextDouble();
		System.out.println("Enter designation : ");
		e.Designation=sc.next();
		
		sc.close();
		
	}
	public void displayEmpDetails() {
		e.InsuranceScheme="No Scheme";
		if((e.Salary>=5000 && e.Salary<20000) && e.Designation.equalsIgnoreCase("System Associate"))
			e.InsuranceScheme="Scheme C";
		else if((e.Salary>=20000 && e.Salary<40000) && e.Designation.equalsIgnoreCase("Programmer"))
			e.InsuranceScheme="Scheme B";
		else if(e.Salary>=40000 && e.Designation.equalsIgnoreCase("Manager"))
			e.InsuranceScheme="Scheme A";
		else if(e.Salary<5000 && e.Designation.equalsIgnoreCase("Clerk"))
			e.InsuranceScheme="No Scheme";
		System.out.println("Employee id\tName\tSalary\tDesignation\tInsurance scheme");
		System.out.println(e.id+"\t\t"+e.Name+"\t"+e.Salary+"\t"+e.Designation+"\t\t"+e.InsuranceScheme);
			
	}
}
