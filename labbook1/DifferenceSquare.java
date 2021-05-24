package labbook1;
import java.util.Scanner;
public class DifferenceSquare {
	public static int calculateDifference(int n)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++) {
			sum1+=(int)Math.pow(i,2);
			sum2+=i;
		}
			
		return (sum1-(int)Math.pow(sum2,2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the term : ");
		int num=sc.nextInt();
		
		System.out.println("The difference between the sum of the squares and " + " the square of the sum of the first " + num + " natural numbers is "+calculateDifference(num));
		
		sc.close();
	}
}
