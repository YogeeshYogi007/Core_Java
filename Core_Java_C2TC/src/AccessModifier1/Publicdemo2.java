package AccessModifier1;

public class Publicdemo2 {
	
		public static void main(String[] args) {
			System.out.println(Publicdemo.b);//accessing static variable
			Publicdemo.m2();
			Publicdemo a2=new Publicdemo();
			System.out.println(a2.a);
			a2.m1();		
		}
}