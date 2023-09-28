package lambdaloop;

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runnable runnable = () -> {
	            for (int i = 0; i < 5; i++) {
	                System.out.println("Hello, Lambda!");
	            }
	        };

	        // Start a new thread and run the task
	        Thread thread = new Thread(runnable);
	        thread.start();
	    }
	


	}


