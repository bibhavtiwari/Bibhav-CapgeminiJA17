package Labbook3;
import java.util.*;
public class ReadAndSumInteger {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the string");
	String str= sc.nextLine();
	StringTokenizer st = new StringTokenizer(str);
	int sum=0;
	while (st.hasMoreTokens()) {
		String s=st.nextToken(" ");
		int n =Integer.parseInt(s);
		System.out.println(n +" ");
		sum = sum+n;	
	}
	System.out.println("Total Sum = " + sum);
}
	}
