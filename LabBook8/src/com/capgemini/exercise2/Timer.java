package com.capgemini.exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer implements Runnable {
	
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		Thread th = new Thread(t);
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				display();
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
