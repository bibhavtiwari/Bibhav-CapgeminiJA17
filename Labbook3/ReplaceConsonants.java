package Labbook3;

public class ReplaceConsonants {
	static String alterstring(char[] str){
		for (int i=0;i<str.length;i++)
		{
			if ((str[i]=='a')||(str[i]=='e')||(str[i]=='i')||(str[i]=='o')||(str[i]=='u'))
			{
				continue;
			}
			else
			{
				int r = (int) str[i];
				str[i]=(char) (r+1);
			}
		}
		return String.valueOf(str);
	}
	}


