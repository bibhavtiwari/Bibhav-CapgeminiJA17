package Labbook3;

public class MirrorImage {
	public void getImage(String s) {
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		System.out.println(s+"|"+str);
	}

}
