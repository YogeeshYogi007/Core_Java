package day16;

public class Equals_Demo6 {

	public static void main(String[] args) {
		Equals_Demo_Sample ed1= new Equals_Demo_Sample("Car");
		Equals_Demo_Sample ed2= new Equals_Demo_Sample("Bicycle");
		Equals_Demo_Sample ed3= new Equals_Demo_Sample("car");
		
		System.out.println("ed1 and ed2 are equal: "+(ed1.equals(ed2)));
		System.out.println("ed2 and ed3 are equal: "+(ed2.equals(ed3)));
		System.out.println("ed1 and ed3 are equal: "+(ed1.equals(ed3)));
		

	}

}
