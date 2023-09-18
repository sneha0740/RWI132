package exceptionstrial;

public class Main implements Trial{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(5/0);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("answer is");
		}
		
		Main main = new Main();
		main.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am in");
	}

}
