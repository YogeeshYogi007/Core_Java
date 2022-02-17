package day9;
class a extends Thread{
	public void run() {
		System.out.println("present ID Of a: "+Thread.currentThread().getId());
	}

}
class b extends Thread{
	public void run() {
		System.out.println("present ID Of b: "+Thread.currentThread().getId());
	}

	
}
class c extends Thread{
	public void run() {
		System.out.println("present ID Of c: "+Thread.currentThread().getId());
	}

	
}
	class d implements Runnable{
		public void run() {
			System.out.println("Present ID Of d: "+Thread.currentThread().getId());
			
		}
		
	}
public class ThreadDemo {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj1=new a();
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		b obj2=new b();
		obj2.setPriority(Thread.MIN_PRIORITY);;
		obj2.start();
		c obj3=new c();
		obj3.setPriority(Thread.NORM_PRIORITY);
		obj3.start();
		d obj4=new d();
		Thread thd=new Thread(obj4);
		thd.setPriority(Thread.MIN_PRIORITY);
		thd.start();
		for (int i=0;i<2;i++)
		{
			System.out.println("The Main Thread Id: "+Thread.currentThread().getId());
		
	}

}
}
