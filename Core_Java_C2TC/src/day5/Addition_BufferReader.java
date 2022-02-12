package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Addition_BufferReader {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		System.out.println("Eneter One Number:");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader Br=new BufferedReader(isr);
		int c=Integer.parseInt(Br.readLine());
		System.out.println("Enter Another Number:");
		InputStreamReader isr1=new InputStreamReader(System.in);
		BufferedReader Br1=new BufferedReader(isr1);
		int b=Integer.parseInt(Br1.readLine());
		int a=c+b;
		System.out.println("The Sum Of Two Number Is:"+a);
			
	}

}
