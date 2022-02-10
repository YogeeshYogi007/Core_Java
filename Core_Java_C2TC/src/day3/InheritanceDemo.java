package day3;

public class InheritanceDemo extends Child
{//sub class
	static void Display() 
	{
		System.out.println("Inside super class");
	}

	public static void main(String[] args) {
		InheritanceDemo.Display();// static method can be accessed directly using class name 
		InheritanceDemo q=new InheritanceDemo();
		q.addition(6, 2);

	}

}
  class Child {//super class
	void addition(int a,int b) 
	{int c= a+b;
	
		System.out.println("Addition of Numbers:"+c);
		
	}

}