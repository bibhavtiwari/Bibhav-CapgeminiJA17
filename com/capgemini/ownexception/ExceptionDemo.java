package com.capgemini.ownexception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ExceptionDemo {
	
	public static void main(String args[]){  
	    try{  
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Mobile Number");
	    String mobileNumber = sc.next();
	    String regex = "^[0-9]{10}$";
	    boolean result = Pattern.matches(regex, mobileNumber);
	    if (result != true)
		{
			throw new InvalidPhone("Not Valid");
		
		}
		else
			System.out.println("Phone Number Valid");
	    }catch(Exception m){System.out.println("Exception occured: "+m);}  
	}
	}

