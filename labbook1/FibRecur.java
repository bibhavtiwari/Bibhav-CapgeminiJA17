package labbook1;
import java.util.Scanner;
public class FibRecur {
	public static int fibonacci(int n) {
		if(n==1 || n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the no. of terms : ");
		int num=sc.nextInt(); 
		if(num%10==1)
			System.out.print("The "+num+"st value of the Fibonacci sequence is "+fibonacci(num));
		else if(num%10==2)
			System.out.print("The "+num+"nd value of the Fibonacci sequence is "+fibonacci(num));
		else if(num%10==3)
			System.out.print("The "+num+"rd value of the Fibonacci sequence is "+fibonacci(num));
		else if(num%100==11 || num%100==12 || num%100==13)
			System.out.print("The "+num+"th value of the Fibonacci sequence is "+fibonacci(num));
		else
			System.out.print("The "+num+"th value of the Fibonacci sequence is "+fibonacci(num));
		
		sc.close();
	}
}
