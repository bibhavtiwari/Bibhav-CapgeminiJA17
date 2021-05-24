package labbook1;
import java.util.Scanner;
public class Prime {
	public static boolean fnisPrime(int n) {
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		int num=sc.nextInt(); 
		System.out.print("The prime nos from 1 to "+num+" are : ");
		for(int i=1;i<=num;i++) {
			if(fnisPrime(i))
				System.out.print(i+" ");
		}
		
		sc.close();
	}
}
