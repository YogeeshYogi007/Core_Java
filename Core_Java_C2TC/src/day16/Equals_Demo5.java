package day16;

public class Equals_Demo5 {

	public static void main(String[] args) {
		Boolean bl1=true;
		Boolean bl2=new Boolean(true);
		Boolean bl3=false;
		
		System.out.println("bl1 and bl2 are equal: "+(bl1.equals(bl2)));
		System.out.println("bl1 and bl3 are equal: "+(bl1.equals(bl3)));
		System.out.println("bl2 and bl3 are equal: "+(bl2.equals(bl3)));
	}

}
