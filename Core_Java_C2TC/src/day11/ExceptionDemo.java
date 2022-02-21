package day11;

public class ExceptionDemo {
	static void func(int a)throws Exception{
		System.out.println(10/a);
	}

	public static void main(String[] args) {
		try {
			func(10);
			func(5);
		}
		catch(Exception e) {
			System.out.println("cant Divide By Zero");
		}

	}

}
