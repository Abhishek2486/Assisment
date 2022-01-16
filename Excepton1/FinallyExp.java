package Excepton1;

public class FinallyExp {

	public static void main(String[] args) {
		try
		{
			int data = 125 / 5;
			System.out.println ("Result:" + data);
		} 
		
		catch (ArithmeticException e) {
			System.out.println (e.getMessage());
		} 
		
		finally {
			
			System.out.println ("No Exception::finally block executed");
		} 
		System.out.println ("rest of the code...");
	} 

}


