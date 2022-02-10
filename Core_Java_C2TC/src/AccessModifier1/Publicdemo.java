package AccessModifier1;

public class Publicdemo {
	public int a=10;
	public static int b=20;
	
	public void m1()
	{
		System.out.println("inside m1");
	}
	
	public  static void m2()
	{
		System.out.println("inside m2");
	}
	
	public static void main(String[] args)
	{
		System.out.println(b);//accessing static variable 
		m2();//accessing static method
		/*We cannot access non static members inside a static method.
		 * To access non-static members we need create object
		 * 
		 */
		Publicdemo a1=new Publicdemo();
		System.out.println(a1.a);//accessing non-static variable
		a1.m1();//accessing non static method
		
	}
}
