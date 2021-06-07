package com.capgemini.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	final static List<MethodClass> mlist=new ArrayList<MethodClass>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		char ch='y';
		do {
			System.out.println("Enter 1 to create");
			System.out.println("Enter 2 to read");
			System.out.println("Enter 3 to update");
			System.out.println("Enter 4 to delete");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the age and nam1e: ");
				MethodReferenceInterface i=MethodClass::new;
				mlist.add(i.MethodReference(sc.nextInt(), sc.next()));
				break;
			case 2:
				for(MethodClass obj:mlist) {
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Enter the name: ");
				name=sc.next();
				for(MethodClass obj:mlist) {
					if(obj.getName()==name) {
						System.out.println("Enter the age: ");
						obj.setAge(sc.nextInt());
					}
				}	
				break;
			case 4:
				System.out.println("Enter the name to be deleted: ");
				name=sc.next();
				MethodClass temp=null;
				for(MethodClass obj:mlist) {
					if(obj.getName()==name) {
						temp=obj;
					}
				}
				mlist.remove(temp);
				break;
				default:
					System.out.println("Wrong choice!");
			}
			System.out.println("Do you want to continue? y/n");
			ch=sc.next().trim().charAt(0);
		}while(ch=='y');
		}

}
