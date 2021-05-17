package stringextraproblems;
import java.util.Scanner;
public class MaxOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int index=0;
		System.out.println("Enter the string");
		String in=sc.nextLine();
		int i=0;
		int[] arr=new int[26];
		while(i<in.length()) {
			char ele=in.charAt(i);
			int code=ele;
			arr[code-97]+=1;
			i+=1;
		}
		int j=0,max=0;
		while(j<arr.length) {
			if(max<arr[j]) {
				max=arr[j];
				index=j;
			}
			j+=1;
		}
		int chrcode=index+97;
		char res=(char)chrcode;
		System.out.println("Maximum occuring character in the string is: " + res + " "+ max + " times");
		sc.close();
	}

}
