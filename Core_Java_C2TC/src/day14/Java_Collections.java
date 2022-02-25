package day14;

import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;

public class Java_Collections {
	void Display(List<String>list) {
		Iterator<String> obj= list.iterator();
		while(obj.hasNext()) {
			System.out.println("Element is: "+obj.next());
		}
	}
	public static void main(String[] args) {
		List<String> oj=new LinkedList<>();
		oj.add("ABC");
		oj.add("DEF");
		oj.add("GHI");
		oj.add("JKL");
		System.out.println("Element is: "+oj);
		
		Java_Collections jc=new Java_Collections();
		jc.Display(oj);
		
		
		
		
	}

}
