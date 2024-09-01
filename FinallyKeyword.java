package ExceptionHandling;

import java.util.InputMismatchException;

public class FinallyKeyword {

    public static void main(String[] args) {
        try {
            System.out.println("main start");
            int x = 10 / 0; // This will throw an ArithmeticException
            String s = null;
            s.length(); // This will throw a NullPointerException
        } 
        catch (NullPointerException e) {
            System.out.println("null pointer exception occurred");
        } 
        catch (ArithmeticException e) {
            System.out.println("arithmetic exception occurred");
        } 
        finally {
            System.out.println("finally block executed");
        }
    }
}