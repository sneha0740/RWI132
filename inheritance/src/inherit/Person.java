package inherit;

public class Person {
	public String name;
	public String gender;
	public Integer age;
	
	
	
	public Person(String name, String gender, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}



	public void info() {
		System.out.println("Person name is " + this.name);
		System.out.println("Person gender is " + this.gender);
		System.out.println("Person age is " + this.age);
	}
}
