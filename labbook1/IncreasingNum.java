package labbook1;
import java.util.Scanner;
public class IncreasingNum {
	public static boolean checkNumber(int n) {
		int temp=0;
		while(n>0) {
			int k=n%10;
			n/=10;
			while(n>0) {
				int r=n%10;
				if(r>k) {
					temp=1;
					break;
				}
				n/=10;
			}
		}
		if(temp==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number : ");
		int num=sc.nextInt(); 
		if(checkNumber(num))
			System.out.println(num+" is an increasing number");
		else
			System.out.println(num+" is not an increasing number");

		sc.close();
	}

}
