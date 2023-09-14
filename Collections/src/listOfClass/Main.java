package listOfClass;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		 TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
			Student st = new Student();
			st.setClasses(sc.next());
			st.setId(sc.nextInt());
			st.setName(sc.next());
			students.add(st);
			System.out.println(st);
		System.out.println(students);
	}

}
