package com.railworld;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("sakshi");
		stack.push("sneha");
		stack.push("shivam");
//		stack.pop();
		stack.push("ankit");
		stack.push("ashish");
		stack.push("avainsh");
//	stack.pop();
//	Iterator<String> itr=stack.iterator();  
//	while(itr.hasNext()){  
//		System.out.println(itr.next());  
//	}
		System.out.println(stack);
		while(!stack.isEmpty()) {
//			if(!stack.isEmpty()) {
	String i=stack.pop();
				System.out.println(i);
			}
		System.out.println(stack);
	}
}

//multiple pop apply