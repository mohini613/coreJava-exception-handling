package ExceptionHandling;

public class NumberFormatExceptionExample {
	    public static void main(String[] args) {
	        String numberStr1 = "123";
	        String numberStr2 = "abc";
	       
	        try {
	            int number1 = Integer.parseInt(numberStr1); // Valid conversion
	            int number2 = Integer.parseInt(numberStr2); // Invalid conversion
	        } catch (NumberFormatException e) {
	            System.out.println("Caught NumberFormatException: " + e.getMessage());
	        }
	    }
	}


