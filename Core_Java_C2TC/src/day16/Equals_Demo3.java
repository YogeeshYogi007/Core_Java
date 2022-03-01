package day16;

public class Equals_Demo3 {

	public static void main(String[] args) {
		String s1= new String("Yogi");
		String s2= new String("yogi");
		String s3= null;
		String s4= "Yogi";
		
		System.out.println("s1 and s2 are equal: "+s1.equals(s2));
		System.out.println("s1 and s4 are equal: "+s1.equals(s4));
		System.out.println("s2 and s4 are equal: "+s2.equals(s4));
		System.out.println("s4 and s3 are equal: "+s4.equals(s3));
		
	}

}
