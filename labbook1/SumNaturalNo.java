package labbook1;
import java.util.Scanner;
public class SumNaturalNo {
	public static int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms : ");
		int num=sc.nextInt(); 
		
		System.out.print("The sum of first "+num+" natural numbers which are divisible by 3 or 5 is "+calculateSum(num));
		sc.close();
	}
}
