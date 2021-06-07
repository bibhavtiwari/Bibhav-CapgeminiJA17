package com.capgemini.exercise3;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter username to be verified: ");
		   String uName = sc.next();
		   System.out.println("Enter password to be verified: ");
		   String password = sc.next();
		   User u = ()->{
			   if(uName.equals("Rama") && password.equals("Krishna")) 
				   return true;
			   else 
			   return false;
			   };
			   System.out.println(u.checkUser());

	}

}
