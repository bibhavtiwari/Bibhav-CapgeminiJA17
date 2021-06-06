package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeMain extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		HashMap<String,Employee> hmap=new HashMap<String,Employee>();
		HashMap<String,Integer> elist=new HashMap<String,Integer>();
		int choice;
		char ch='y';
		while(ch=='y') {
			System.out.print("1. Add Employee\n");
			System.out.println("2. Display Employee with Insurance Scheme\n");
			System.out.println("3. Delete Employee\n");
			System.out.println("Enter your choice :");
			choice= sc.nextInt();
			switch(choice) {
			case 1 : System.out.print("Enter the number of entries : ");
			int num=sc.nextInt();
			Employee emp[]=new Employee[num];
			for(int i=0;i<num;i++) {
				emp[i]=new Employee();
			}
			for(int i=0;i<num;i++) {
				System.out.println("Enter id : ");
				emp[i].id=sc.nextInt();
				System.out.println("Enter name : ");
				emp[i].name=sc.next();
				System.out.println("Enter salary : ");
				emp[i].salary=sc.nextDouble();
				System.out.println("Enter designation : ");
				sc.nextLine();
				emp[i].designation=sc.nextLine();
				hmap.put(emp[i].getInsuranceScheme(), emp[i]);
				elist.put(emp[i].getInsuranceScheme(),emp[i].id);
				System.out.println();
			}
			System.out.println("Displaying......");
			for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
				System.out.println(m.getValue());
			}
			break;
			case 2 : 
				System.out.print("Enter the insurance scheme : ");
				sc.nextLine();
				String ins_scheme=sc.nextLine();
				System.out.print("The employee details for according to the  insurance scheme are :");
				for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
					if(m.getKey().equalsIgnoreCase(ins_scheme))
						System.out.println(m.getValue());
				}
			
			break;
			case 3:
				
			System.out.print("Enter the id of the employee you want to delete : ");
			int id=sc.nextInt();
			for(Map.Entry<String,Integer> m : elist.entrySet()) {
				if(m.getValue()==id)
					hmap.remove(m.getKey());
			}
			System.out.println(" Deleting employee details sucessful.....:");
			for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
				System.out.println(m.getValue());
			}
			break;
			default : System.out.println("Invalid Choice....");
			}
			System.out.println();
			System.out.print("Do you want to continue?(y/n) ");
			ch=sc.next().charAt(0);
		} sc.close();
	
			


	}

	}
