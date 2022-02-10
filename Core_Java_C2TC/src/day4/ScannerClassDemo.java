package day4;
import java.util.Scanner;
class D{
	void m1() {
	System.out.println("Iam in method1");
	
	}
}
public class ScannerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Number 1:");
Scanner sc= new Scanner(System.in);
int x = sc.nextInt();
System.out.println("Enter Values for number 1"+x);
D a = new D();
a.m1();


	}

}
