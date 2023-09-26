package com.railworld;

import java.util.Scanner;
import java.util.Stack;

public class StackAddPush {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		Scanner scanner=new Scanner(System.in);
     System.out.println("enter a name ");
       
    for(int i=0;i<5;i++){
    	String string = scanner.next();	 
 stack.push(string);
	System.out.println(i);
  }
    System.out.println(stack);
	}

}
