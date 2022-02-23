package day13;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class Linked_List_Demo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		//add
		ll.add("2021");
		ll.add("2022");
		System.out.println(ll);
		//To add first
		ll.addFirst("2020");
		System.out.println(ll);
		//To add Last
		ll.addLast("2023");
		System.out.println(ll);
		//ArrayList to perform AddAll
		ArrayList<String> al=new ArrayList<String>();
		al.add("2024");
		al.add("2025");
		al.add("2025");
		System.out.println(al);
		//to add all
		ll.addAll(al);
		System.out.println(ll);
		//to add all
		al.addAll(1, ll);
		System.out.println(al);
		System.out.println(ll);
		//remove
		ll.remove();
		System.out.println(ll);
		//To remove first
		ll.removeFirst();
		System.out.println(ll);
		//to Remove Last
		ll.removeLast();
		System.out.println(ll);
		//To clear
		//ll.clear();
		//System.out.println(ll);*/
		//to contains
		System.out.println(ll.contains("2022"));
		//to clone
		System.out.println(ll.clone());
		//To contains all
		System.out.println(ll.containsAll(al));
		
		if(ll.equals(ll))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are unequal");
		}
		//to Iteration
		Iterator<String> itr=ll.descendingIterator();
		while(itr.hasNext()) 
		{
		System.out.println(itr.next());
		}
		}
}

