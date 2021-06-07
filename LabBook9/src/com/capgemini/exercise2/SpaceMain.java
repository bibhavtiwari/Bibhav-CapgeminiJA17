package com.capgemini.exercise2;

import java.util.Scanner;

public class SpaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.next();
		Space sa = ()->{return s.replace(""," ").trim();};
		System.out.println("Output string: "+ sa.addSpace());
	}

}
