package Labbook3;
import java.util.*;
public class MainStringPolarity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		StringPolarity obj = new StringPolarity();
		System.out.println(obj.positivecheck(s));
		
	}

}
