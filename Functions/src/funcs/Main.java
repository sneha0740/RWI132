package funcs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int res = avg(a,b,c);
		display(res);
	}

	public static int avg(int i, int j, int k)
	{
		int sum = 0;
		sum = i+j+k;
		int mean = sum/3;
		
		return mean;
	}
	
	public static void display(int res) {
		System.out.println(res);
	}
}
