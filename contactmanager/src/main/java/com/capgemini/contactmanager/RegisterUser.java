package com.capgemini.contactmanager;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {

	private String firstName;
	private String lastName;
	private String mobileNo;
	private String userName;
	private String password;
	Scanner sc = new Scanner(System.in);


	public RegisterUser() {
		super();
	}
	

	public RegisterUser(String firstName, String lastName, String mobileNo, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String validateFirstName(String fName) {
		if(fName == null || fName.equals("")) {
			return "First Name cannot be null";
		}else {
			return "First Name is valid";
		}
	}

		public String validateLastName(String lName) {
			if(lName == null || lName.equals("")) {
				return "Last Name cannot be null";
			}else {
				return "Last Name is valid";
			}
	}
	
	public String validateMobileNo(String mobNo) {
		if(mobNo.length() != 10) {
			return "mobileNo cannot be less than 10 digits" ;
		}
		else if(!mobNo.matches("\\d+")) {
			return "mobileNo can contain only digits" ;
		}
		else if(!mobNo.startsWith("0")) {
			return "mobileNo should start with 0";
		}else {
			return "Mobile number is valid";
		}
	}
	public String validatepassword(String password) {
		if(password.length() < 8) {
			return "password cannot be less then 8";
		}
		else if(password.length()>16) {
			return "Password cannot be more then 16 characters";
		}
		else {
			return "Password is Valid";
		}
	}
	public String validateuserName(String userName) {
	 String regex = "^[A-Za-z][_-]{8,}$";
	 Pattern p = Pattern.compile(regex);
	 Matcher m = p.matcher(userName);
	 if (m.matches() == false) {
		 return "UserName Not Valid";
	 }
	 else
	 {
		 return "UserName is Valid";
	 }
	}
	public void readDetails() {
		System.out.println("Enter the details of Contact");
		System.out.println("Enter the firstName ");
		System.out.println(validateFirstName(firstName = sc.nextLine()));
		System.out.println("Enter the lastName ");
		System.out.println(validateLastName(lastName = sc.nextLine()));
		System.out.println("Enter the mobileNo ");
		System.out.println(validateMobileNo(mobileNo = sc.nextLine()));
		System.out.println("Enter the UserName ");
		System.out.println(validateuserName(userName = sc.nextLine()));
		System.out.println("Enter the password ");
		System.out.println(validatepassword(password = sc.nextLine()));
	}
		
	public String displayDetails() {
		return "The details of the contact is = " + firstName + "\t" + lastName +"\t" +mobileNo+"\t"+userName+"\t"+password;
	}
	
	
}
