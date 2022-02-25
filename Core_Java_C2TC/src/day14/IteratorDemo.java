package day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
	void Display(List<String> List) {
	 Iterator<String> obj= List.listIterator();
	 while(obj.hasNext()) {
		 System.out.println("Elements is: "+obj.next());
	 }
	 
	}

	public static void main(String[] args) {
		List<String> ob=new LinkedList<String>();
		ob.add("Sam");
		ob.add("ABC");
		ob.add("DEF");
		ob.add("GHI");
		System.out.println("Element is :"+ob);
		IteratorDemo it=new IteratorDemo();
		ob.sort(null);
		it.Display(ob);
		System.out.println("#################");
		Collections.reverse(ob);
		it.Display(ob);
		}

}
