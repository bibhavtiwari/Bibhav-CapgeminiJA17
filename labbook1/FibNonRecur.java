package labbook1;
import java.util.Scanner;
public class FibNonRecur {
	public static int fibonacci(int num) {
		int f1=0,f2=1,f3=0;
		
		
		for(int i=1;i<=num;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		
		return f1;
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
