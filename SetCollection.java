package com.railworld;

import java.util.*;


public class SetCollection {

	public static void main(String[] args) {
     Set<String>set=new HashSet<>();
     Scanner scanner =new Scanner(System.in);
     System.out.println("enter a name");
     for(int i=0;i<5;i++) {
    	String string=scanner.next();
    	set.add(string);
    	System.out.println(set);
	 
     }
     
//     Iterator<String> itr=set.iterator();  
//while(itr.hasNext()){  
//	System.out.println(itr.next());  
}
 	}
    

