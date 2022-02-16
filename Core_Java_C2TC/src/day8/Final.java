package day8;
	   class a{
		 int w=2;
		final void m1() {
		 int w=3;
			 System.out.println("The First Print:"  +w);
		 }
		 void m2() {
			 System.out.println("The method that was first written:");
		 }
	 }

public class Final extends a{
	@Override
	void m2() {
		System.out.println("The method Overridden:");
		
}

	public static void main(String[] args) {
		a obj =new a();
		obj.m1();
		obj.m2();
		Final n=new Final();
		n.m2();
		

	}

}
