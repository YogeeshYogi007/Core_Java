package day18;


	class a implements Runnable
	{
		public void run()
		{
			System.out.println("1");
		}
	}
	class b implements Runnable
	{
		public void run()
		{
			System.out.println("2");
		}
		
	}
	public class ThreadPro {
	
	public static void main(String[] args) {
			a obj=new a();
			Thread th=new Thread(obj);
			b obj1=new b();
			Thread th1=new Thread(obj1);
			for(;;)
			{
				if(Thread.currentThread().equals(th))
				{
					System.out.println(Thread.currentThread().getId());
					
				}
				else
				{
					long id=th1.getId();
					System.out.println(id);
				}
			}
			
	}
	}
