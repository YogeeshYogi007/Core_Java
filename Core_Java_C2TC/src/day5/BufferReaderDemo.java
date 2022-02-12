package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader Br=new BufferedReader(isr);
		int c=Integer.parseInt(Br.readLine());
		System.out.println("The Number i Enterd:"+c);
		
		
		
		
		
		

	}

}
