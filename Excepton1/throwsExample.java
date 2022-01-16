package Excepton1;

import java.io.ObjectInputStream.GetField;

public class throwsExample {
	public static void main(String[] args)throws ArithmeticException{
		try {
			int a = 750;
			int b=0;
			int c=a/b;
		} catch (Exception e) {
			System.out.println(e.getMessage()+"\"cannot Divided by Zero\"");
			
		}


	}

}

