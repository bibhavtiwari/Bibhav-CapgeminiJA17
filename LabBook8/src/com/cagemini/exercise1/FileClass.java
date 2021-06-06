package com.cagemini.exercise1;

import java.io.File;

public class FileClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File initial=new File("G:\\CapgeminiJA17\\LabBook8\\src\\com\\cagemini\\exercise1\\initial.txt"); 
		File target=new File("G:\\CapgeminiJA17\\LabBook8\\src\\com\\cagemini\\exercise1\\target.txt");
		CopyThread cd = new CopyThread(initial,target);
		cd.start();
}
}