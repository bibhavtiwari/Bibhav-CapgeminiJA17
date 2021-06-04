package com.capgemini.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReturnSquares {
	public static Map<Integer,Integer> getSquares(int[] array){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			map.put(array[i], array[i]*array[i]);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size=sm.nextInt();
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element No."+(i+1)+" : ");
				array[i]=sm.nextInt();
			}
			Map<Integer,Integer> map=getSquares(array);
			System.out.print("The numbers along with their squares are given below :\n");
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				System.out.println("Number : "+m.getKey()+", Square of "+m.getKey()+" : "+m.getValue());
			}
		
		sm.close();
	}
	}

