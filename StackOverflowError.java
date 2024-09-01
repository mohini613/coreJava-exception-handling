package ExceptionHandling;

public class StackOverflowError {

	    public static void main(String[] args) {
	        recursiveMethod(1);
	    }

	    public static void recursiveMethod(int i) {
	        System.out.println("Number: " + i);
	        recursiveMethod(i + 1);
	    }
	}
