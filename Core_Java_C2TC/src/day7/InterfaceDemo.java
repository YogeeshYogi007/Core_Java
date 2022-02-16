package day7;
interface a{
	void m1();
	
}
class bb implements a {
	public void m1() {
		System.out.println("HELLO");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		bb obj = new bb();
		obj.m1();
		
	}

}
