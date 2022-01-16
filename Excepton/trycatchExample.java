package Excepton;

public class trycatchExample {
	
	public static void main(String[] args) {
		try {
		int a=20,b=0;
		int c=a/b;
		System.out.println("result"+c);
		}
		catch(ArithmeticException e) {
			System.out.println("A number can't divided by zero");
			
		}
		
	}

}
