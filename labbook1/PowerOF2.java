package labbook1;
import java.util.Scanner;
public class PowerOF2 {
	public static boolean checkNumber(int n) {
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) 
	            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in); 
	System.out.print("Enter the number : ");
	int num=sc.nextInt(); 
	if(checkNumber(num))
		System.out.println(num+" is a power of two");
	else
		System.out.println(num+" is not a power of two");

	sc.close();
}
}
