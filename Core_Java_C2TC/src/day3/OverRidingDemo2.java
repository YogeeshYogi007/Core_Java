package day3;

public class OverRidingDemo2 extends OverRidingDemo1
{
	void display()
	{
		System.out.println("Enter your date of birth:");
	}
	public static void main(String[] args) {
		OverRidingDemo2 H=new OverRidingDemo2();
		H.display();

	}

}
