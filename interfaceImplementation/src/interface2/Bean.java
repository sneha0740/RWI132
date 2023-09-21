package interface2;

public class Bean implements Ankit{
	private int salary;
	private String name;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bean(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bean [salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public void displaySalary(int salary) {
		// TODO Auto-generated method stub
		System.out.println(salary);
		
	}
	@Override
	public void displayName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	
	
}
