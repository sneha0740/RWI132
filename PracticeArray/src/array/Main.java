package array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[n];
		for(int i = 0; i<n; i++)
		{
			b [i] = sc.nextInt();
		}
		for (int i=0; i<5; i++)
			System.out.print(b[i] + " ");
	}

}
