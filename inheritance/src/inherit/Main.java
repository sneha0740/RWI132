package inherit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1,55,"Ankit", "Male", 20);
		student.info();
		Person p = new Student(12, 25,"ankit", "male", 20);
		Student st = (Student)p;
		st.show();
	}

}
