package ExceptionHandling;

public class NullPointer {
	  public static void main(String[] args) 
	  {
		  System.out.println("try block executing with  multiple catch block ");
try {
	System.out.println("main start");
	int x=10/0;
	String s= null;
	s.length();
	
}
catch (NullPointerException e) {
	System.out.println("null pointer exception occured");
}
catch (ArithmeticException e) {
	System.out.println("arithmetic exception");

}
}
}

