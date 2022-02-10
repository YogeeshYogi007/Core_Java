package day3;

public class OverRidingDemo1 {
	void display() 
	{
		System.out.println("Enter your name:");
	}
	public static void main(String[] args) {
		OverRidingDemo1 E=new OverRidingDemo1();
		E.display();
	}
}
