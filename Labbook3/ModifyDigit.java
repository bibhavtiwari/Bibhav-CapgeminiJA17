package Labbook3;

import java.util.Scanner;

public class ModifyDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int b = modifynumber(n);
		System.out.println(b);
		sc.close();}
	static int modifynumber(int n)
	{
		int a ,d=0;
		String s= Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		StringBuffer str = null;
		String st;
		for (int i=1; i<s.length();i++)
		{
			d=(int)(s.charAt(i))-(int)(s.charAt(i-1));
			if (d<0)
			{
				d=d*(-1);
			}
			str = sb.append(d);
			if (i==(s.length()-1))
			{
				str = sb.append(s.charAt(i));
			}
			
		}
		st = str.toString();
		a=Integer.valueOf(st);
		return a;
		
	}

}
