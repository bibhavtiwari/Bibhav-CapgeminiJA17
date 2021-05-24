package labbook1;
import java.util.Scanner;
public class TrafficLight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("R - Red\nY - Yellow\nG - Green");
		System.out.print("Enter your choice : ");
		char choice = sc.next().charAt(0); 
		switch(choice)
		{
			case 'r':
			case 'R':
				System.out.println("stop");
				break;
			case 'y':
			case 'Y':
				System.out.println("ready");
				break;
			case 'g':
			case 'G':
				System.out.println("go");
				break;
			default :
				System.out.println("Enter correct choice (R/Y/G)...");
		}
		
		sc.close();
	}
}
