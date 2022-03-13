package day18;

public class Hero implements Actor {
	public void act()
	{
		System.out.println("I can Act");
	}
	public void speak()
	{
		System.out.println("I can Speak");
	}
	public void comedy()
	{
		System.out.println("I make People Laugh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero a=new Hero();
		a.act();
		a.speak();
		a.comedy();
	}

}
