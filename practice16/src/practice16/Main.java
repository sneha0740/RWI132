package practice16;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "$2000";
		s = s.substring(1);
		int n = Integer.parseInt(s);
		s = "$" + String.valueOf(++n);
		System.out.println(s);
	}

}
