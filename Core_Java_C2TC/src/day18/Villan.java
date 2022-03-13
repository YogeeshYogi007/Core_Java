package day18;

public class Villan implements Actor {
		public void act()
		{
			System.out.println("I can Act");
		}
		public void speak()
		{
			System.out.println("I can Speak");
		}
		public void rude()
		{
			System.out.println("I an rude");
		}
		public static void main(String[] args) {
		
			Villan v=new Villan();
			v.act();
			v.speak();
			v.rude();
		
		}

}
