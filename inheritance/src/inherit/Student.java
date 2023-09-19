package inherit;

public class Student extends Person {
	public Integer rollno;
	public Integer marks;
	public Student(Integer rollno, Integer marks, String name, String gender, Integer age) {
		super(name, gender,age);
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override
	public void info() {
		System.out.println("rollno " + rollno + " " +  marks + " " +  name + " " +  gender + " " +  age);
	}
	
	public void show() {
		System.out.println("asjfjb");
	}
	
}
