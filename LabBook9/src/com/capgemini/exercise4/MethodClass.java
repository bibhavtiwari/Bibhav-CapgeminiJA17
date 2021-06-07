package com.capgemini.exercise4;

public class MethodClass {
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MethodClass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public MethodClass() {
		super();
	}
	
}
