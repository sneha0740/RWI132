package com.railworld;

import java.util.*;

public class ArrayListCollection {
	 public static void main(String[] args) {
	       
	        ArrayList<String> list1 = new ArrayList<>();
	       
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Cherry");

	        Set<String> list2 = new HashSet<>();
	        list2.add("Date");
	        list2.add("Fig");

	        list1.addAll(list2);
	        System.out.println(list1);
}
}