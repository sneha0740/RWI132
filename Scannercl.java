package Scanner;

import java.util.Scanner;

public class Scannercl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking Input from the user");
       try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Entar number 1");
		   float a=sc.nextFloat();
		   System.out.println("Entar number 2");
		   float b=sc.nextFloat();
		  float sum=a+b;
		   System.out.println("thee sum of these numbers is");
		   System.out.println(sum);
	}
	}

}
