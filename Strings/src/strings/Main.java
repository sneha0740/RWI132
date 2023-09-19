package strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String S1 = "Welcome";
		String S2 = new String ("Welcome");
		
		if(S1==S2) {
			System.out.println("S1");
			}
		else {
			System.out.println("*");
		}
		*/
		String s1 = "welcome";
		String s2 = "welcome";
		
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		
		String s = new String("welcome");
		String s4 = new String("welcome");
		
		System.out.println(s==s4);
		System.out.println(s.length());
	}

}
