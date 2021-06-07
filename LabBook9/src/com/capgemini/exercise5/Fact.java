package com.capgemini.exercise5;

public class Fact {
	public static int calculateFactorial(int n) {
		int a = 1;
		for(int i=1; i<=n; i++) {
			a = a*i;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = Fact::calculateFactorial;
		
		System.out.println(f.test(8));
	}

}
