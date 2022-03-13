package day18;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Num=Arrays.asList(1,2,3,4,5,6);
		/*for(int i=0; i<6; i++)
		{
			System.out.println(Num.get(i));
		}*/
		
		/*Iterator<Integer> itr= Num.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		/*for(int i:Num)
		{
			System.out.println(i);
		}*/
		
		/*Num.forEach(new Consumer<Integer>(){
			public void accept(Integer i){
				System.out.println(i);
			}
		});*/
		//Num.forEach(System.out::println);
		//Num.forEach(i-> doubleIt(i));
		Num.forEach(StreamAPIDemo::doubleIt);
	
	}

		public static void doubleIt(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i*2);
	}

}
