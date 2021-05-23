package com.capgemini.contactmanager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterUserTest {
public static RegisterUser ru;

	@BeforeAll
	static void setUp() {
		ru = new RegisterUser("Rama","Krishna","0987654234","Rama-Krishna","RamaRama");
	}

	@Test
	public void testRegisterUser() {
		RegisterUser ru= new RegisterUser("Rama","Krishna","0987654234","Rama-Krishna","RamaRama");
		assertNotNull(ru);
		Contact ruOne = null;
		assertNull(ruOne);
	}
	@Test
	public void testValidateFirstName() {
		assertSame("First Name is valid", ru.validateFirstName(ru.getFirstName()));
		assertNotSame(null, ru.validateFirstName(ru.getFirstName()));
	}
	@Test
	public void testValidateLastName() {
		
		assertSame("Last Name is valid", ru.validateLastName(ru.getLastName()));
		assertNotSame(null, ru.validateLastName(ru.getLastName()));
	}
	@Test
	public void testValidateMobileNo() {
	
		assertNotSame("mobileNo cannot be less than 10 digits", ru.validateMobileNo(ru.getMobileNo()));
		assertNotSame(null, ru.validateMobileNo(ru.getMobileNo()));
		assertNotSame("mobileNo can contain only digits", ru.validateMobileNo(ru.getMobileNo()));
		assertNotSame("mobileNo should start with 0", ru.validateMobileNo(ru.getMobileNo()));
		assertSame("Mobile number is valid",  ru.validateMobileNo(ru.getMobileNo()));
		assertSame("mobileNo can contain only digits",  ru.validateMobileNo("s123456780"));
		assertSame("mobileNo should start with 0",  ru.validateMobileNo("9075468967"));
	}
	@Test
	public void testValidatepassword() {
		assertNotSame("password length cannot be less then 8",ru.validatepassword(ru.getPassword()));
		assertNotSame("password length cannot be greater then 16",ru.validatepassword(ru.getPassword()));
		assertNotSame(null, ru.validatepassword(ru.getPassword()));
		assertSame("Password is valid", ru.validatepassword(ru.getPassword()));
	}
	@Test
	public void testValidateuserName() {
		assertNotSame(null,ru.validateuserName(ru.getUserName()));
		assertSame("Username must contain _ or -",ru.validateuserName(ru.getUserName()));
		assertSame("Username is valid",ru.validateuserName(ru.getUserName()));
		
	}
	@Test
	public void testDisplayDetails() {
		assertEquals(new String("The details of the contact is = Rama Krishna 0987654234 user_name RamaRama"),ru.displayDetails());
		assertNotEquals(new String("The details of the contact is = Shiva Rama 0987654234 username passwirt"), ru.displayDetails());
	}
	
	@AfterEach
	public void stopThis() {
		System.out.println("this method is annoted with @AfterEach"
				+ "to execute after each test case");
	}
	
	@AfterAll
	public static void stopAll() {
		System.out.println("this method is annoted with @AfterAll"
				+ " to execute as last method in the test class ContactTest");
		ru= null;//now after assigning ct object to null it is eligible for removing from the memory
	}
}
