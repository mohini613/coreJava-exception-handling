package ExceptionHandling;

	public class IllegalArgumentException {

	    public static void main(String[] args) {
	        try {
	            validateNumber(100); // Trying to validate a number
	            validateNumber(-10); // Trying to validate a negative number
	        } catch (java.lang.IllegalArgumentException e) {
	            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
	        }
	    } 

	    public static void validateNumber(int number) {
	        if (number < 0) {
	            throw new java.lang.IllegalArgumentException("Number must be non-negative!");
	        }
	        System.out.println("Valid number: " + number);
	    }
	}
