package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch implements Cloneable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your id");
		int id=0;
		try {
			id = sc.nextInt();
		}
      catch (InputMismatchException i) {
    	  System.out.println("id must be in digits");
      }
		System.out.println(id);
	}

}
