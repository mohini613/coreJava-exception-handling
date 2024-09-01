package ExceptionHandling;

public class ExceptionInInitializerErrorExample {
	 // Static initializer block
	    static {
	        int[] array = new int[5];
	        System.out.println(array[10]); // Trying to access an out-of-bounds index
	    }
	    public static void main(String[] args) {
	        try {
	            // Attempting to use the class after the static block has failed
	            System.out.println("Inside main method");
	        } catch (ExceptionInInitializerError e) {
	            System.out.println("Caught ExceptionInInitializerError: " + e.getMessage());
	        }
	    }
	}


