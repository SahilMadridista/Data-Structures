package javastack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		
		s.push(12);
		s.push(15);
		s.push(18);
		s.push(1);
		s.push(9);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s);
		
	}
	
}
