package com.capgemini.exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortList {
public static List getValues(HashMap<Character,Integer> hm){
		
		List<Map.Entry<Character, Integer>> lst = new ArrayList<>(hm.entrySet());
		
		Collections.sort(lst, new Comparator<Map.Entry<Character, Integer>>() {
			public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
				return m1.getValue()-m2.getValue();
			}
		});
		
		return lst;
	}

  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> hm=new HashMap<>();
		System.out.print("Enter the size of your Hash Map : ");
		char c;
		int size=sc.nextInt();
		if(size<1)
			System.out.println("Size should be 1 or more.");
		else {
			for(int i=0;i<size;i++) {
				System.out.printf("Enter Key  : ",(i+1));
				c=sc.next().charAt(0);
				hm.put(c, (int)c);
			}}
			List<Map.Entry<Character, Integer>> list = getValues(hm);
			for(int i=0;i<list.size();i++) {
				Map.Entry<Character, Integer> m = list.get(i);
				System.out.println((i+1)+". "+m.getKey()+" : "+m.getValue());
			}
}}