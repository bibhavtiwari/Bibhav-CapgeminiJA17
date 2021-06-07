package com.capgemini.exercise1;

import java.util.Scanner;

public class PowerMain {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter X and Y values:");
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		Power obj = () ->{return (long) Math.pow(x,y);};
		System.out.println("X power Y is: "+obj.powerOfX());
	 	}
}
