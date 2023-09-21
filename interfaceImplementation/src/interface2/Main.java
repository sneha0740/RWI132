package interface2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		String name = sc.next();
		Bean bean = new Bean();
		bean.setName(name);
		bean.setSalary(salary);
		bean.displayName(bean.getName());
		bean.displaySalary(bean.getSalary());
	}

}
