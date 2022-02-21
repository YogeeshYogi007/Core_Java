package day11;

public class ThrowsDemo {
	void validate(int income){
		try{
			if (income>5) 
			{
			//System.out.println("You'r not elegible");
			throw new ArithmeticException("You'r not elegible");
			}
		else 
			{
			System.out.println("You'r elegible");
			}
		   }
		catch(Exception e)
			{
			e.printStackTrace();
			System.out.println("Sorry");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo td=new ThrowsDemo();
		td.validate(4);
		System.out.println("Welcome");
		
	}

}
