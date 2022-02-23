package day13;

import java.util.Stack;

public class Java_Collection {

	public static void main(String[] args) {
		Stack<String> oj= new Stack<>();
		//Push
		oj.push("Yogi");
		oj.push("sam");
		oj.push("nagu");
		oj.push("tanu");
		System.out.println(oj);
		//pop
		oj.pop();
		System.out.println(oj);
		//Peek
		System.out.println(oj.peek());
		//empty
		System.out.println(oj.empty());
		//Search
		System.out.println(oj.search("Yogi")); 
	}

}
