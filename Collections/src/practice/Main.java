
package practice;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(69);
		arr.add(100);
		System.out.println(arr);
		arr.removeAll(arr);
		System.out.println(arr);
	}
}
