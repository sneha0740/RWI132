package practice2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 5;
		int res = 0;
		switch (c) {
		case 1:
			res = a + b;
			break;
		case 2:
			res = a - b;
			break;
		case 3:
			res = a * b;
			break;
		case 4:
			res = a / b;
		case 5:
			res = b % a;
			break;
		default:
			System.out.println("Please enter correct number");
		}

		System.out.println(res);
	}

}
