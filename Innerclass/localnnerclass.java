package Innerclass;

public class localnnerclass {
	private String msg = "Hello! Welcome to Github";


	void display() {
		class Inner {
			void msg() {
				System.out.println(msg);
			}
		}

		Inner innerObj = new Inner();
		innerObj.msg();
	}


	public static void main(String[] args) {
	
		 localnnerclass demo = new  localnnerclass();
		demo.display();

	}
}
