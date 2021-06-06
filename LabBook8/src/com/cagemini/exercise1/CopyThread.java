package com.cagemini.exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThread extends Thread {
	File initial;
	File target;
	public CopyThread(File initial,File target) {
		this.initial=initial;
		this.target=target;
	}
	
	public void run() {
		FileInputStream input = null;
		try {
			input = new FileInputStream(initial);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(target);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int counter=0;
		int characters=0;
		try {
			while((characters=input.read())>0) {
				output.write((char)characters);
				counter++;
				if(counter%10==0) {
				try {
					System.out.println("10 characters are copied");
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
