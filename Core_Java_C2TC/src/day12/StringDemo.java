package day12;

public class StringDemo {

	public static void main(String[] args) {
		//1st sting
		String s="Hello";
		System.out.println("Print 1st String: "+s);
		System.out.println("Print the length of String: "+s.length());
		//2nd String
		String s1=new String("World");
		System.out.println("Print 2nd String: "+s1);
		s.concat(s1);
		System.out.println("Concat of 1st and 2nd String: "+s);
		//join two String
		String s2=s.concat(s1);
		System.out.println("Concat of 1st and 2nd String: "+s2);
		//3rd String
		String s3="Hello";
		System.out.println("Print 3rd String: "+s3);
		//If both String are equal
		if(s==s3)
		{
			System.out.println("s=s3");
		}
		else 
		{
			System.out.println("s=!s3");
		}
		s.equals(s3);
		System.out.println("s=s3"+s.equals(s3));
	}
}
