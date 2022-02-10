package day3;
/*Method name should be same but with different parameters
 * IS-A Relationship is not required 
 * 
 */
public class OverloadingDemo {
	void addition (int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void addition(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		OverloadingDemo OLD = new OverloadingDemo();//We can't access non static members inside a  static method so we have created an object
		OLD.addition(5,4,1);
		OLD.addition(2, 7);
		
	}

}
