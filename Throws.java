package ExceptionHandling;

public class Throws {

	public static void main(String[] args) throws InterruptedException {
	Throws t=new Throws();
	t.m1();

	}

	public  void m1() throws InterruptedException {
		System.out.println("M1() start");
		Thread.sleep(2000);//0p will appear after 2 sec
		System.out.println("m1() End");
		// TODO Auto-generated method stub
		
	}

}
