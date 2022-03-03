import java.util.Scanner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestDemo {
@Test
	void display()
	{
		int a,b,n1,n2;
		System.out.println("Enter A Number");
		Scanner sc=new Scanner(System.in);
		n1 = sc.nextInt();
		System.out.println("Enter Another Number");
		Scanner sc1=new Scanner(System.in);
		n2 = sc1.nextInt();
		System.out.println("Addition of two Numbers: "+(n1+n2));
	}
@Disabled
@Test
void display1()
{
	System.out.println("Hi please follow the instructions");
}
}
