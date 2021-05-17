package Labbook3;

public class StringPolarity {
	static boolean positivecheck(String s) 
	{ boolean a =true;
		for (int i=0;i<s.length();i++)
		{
			if( (int)(s.charAt(i)) > (int)(s.charAt(i)))
			{
				a=false;
				break;
			}
			else
			{
				continue;
			}
			
		}
		return a;
	} 

}
