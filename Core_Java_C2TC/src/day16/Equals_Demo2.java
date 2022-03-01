package day16;

public class Equals_Demo2 {

	public static void main(String[] args) {
		String s1= new String("Yogi");
		String s2= new String("Yogi");
		
		System.out.println("s1 and s2 are equal: "+(s1==s2));
		System.out.println("si and s2 are equal: "+(s1.equals(s2)));
		
		s1=s2;
		System.out.println("s1 and s2 are equal: "+(s1==s2));
	
	}

}
