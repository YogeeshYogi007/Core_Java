package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Btw_Array_Vector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		//Iterator<Integer> Iterator= list.iterator();
		Iterator<Integer> Iterator=list.iterator();
		while(Iterator.hasNext())//Used to check whether the element is present or not
		{
			Integer n=Iterator.next();
			System.out.println(n);
		
		if(n==5)
		{
			Iterator.remove();
		}
		
		

	}
	}
}





