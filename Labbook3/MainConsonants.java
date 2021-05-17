package Labbook3;
import java.util.*;

public class MainConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st = sc.next();
		ReplaceConsonants obj = new ReplaceConsonants();
		System.out.println(obj.alterstring(st.toCharArray()));
		
	}

}
