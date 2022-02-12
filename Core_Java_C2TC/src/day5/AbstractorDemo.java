package day5;
abstract class you{
	int q=10;
	int w=2;
	int i;
	abstract void m1();
	void m2() {
		i=q*w;
		System.out.println("product"+i);
	}
}
 class me extends you {
	 int s=4;
	 int d=5;
	 int h;
	 void m1() {
		 i=q/w;
		 System.out.println("Division:"+i);
		 
		 
	 }
	void m3() {
	h=d+s;
	System.out.println("sum="+h);
	}
 }

public class AbstractorDemo { 

	public static void main(String[] args) {
		me iu=new me();
		iu.m1();
		iu.m2();
		iu.m3();
		


}
}