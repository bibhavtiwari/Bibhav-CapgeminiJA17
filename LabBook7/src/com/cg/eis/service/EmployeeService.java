package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

 interface EmployeeInterface {
	void getEmpDetails();
	void displayEmpDetails();
}
public class EmployeeService extends Employee implements EmployeeInterface {
Employee emp =new Employee(); 
	
	public void getEmpDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id : ");
		emp.id=sc.nextInt();
		System.out.println("Enter name : ");
		emp.name=sc.next();
		System.out.println("Enter salary : ");
		emp.salary=sc.nextDouble();
		System.out.println("Enter designation : ");
		emp.designation=sc.next();
		
		sc.close();
		
	}
	public void displayEmpDetails() {
		emp.insuranceScheme="No Scheme";
		if((emp.salary>=5000 && emp.salary<20000) && emp.designation.equalsIgnoreCase("System Associate"))
			emp.insuranceScheme="Scheme C";
		else if((emp.salary>=20000 && emp.salary<40000) && emp.designation.equalsIgnoreCase("Programmer"))
			emp.insuranceScheme="Scheme B";
		else if(emp.salary>=40000 && emp.designation.equalsIgnoreCase("Manager"))
			emp.insuranceScheme="Scheme A";
		else if(emp.salary<5000 && emp.designation.equalsIgnoreCase("Clerk"))
			emp.insuranceScheme="No Scheme";
		System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary+"\t"+emp.designation+"\t"+emp.insuranceScheme);
			
	}
}

