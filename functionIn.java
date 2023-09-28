package functionInterface;

@FunctionalInterface

public interface functionIn {
	
     //Abstract method
	public void sayHello();
	
	//default method
	default void saybye() {
		
	};
	//Static method
	public static void sayok() {
	};
	}
	
	


