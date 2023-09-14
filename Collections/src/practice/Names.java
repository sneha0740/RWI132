package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		names.add(sc.nextLine());
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
