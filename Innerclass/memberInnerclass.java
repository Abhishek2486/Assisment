package Innerclass;

public class memberInnerclass {
	private String msg = "Hello!";

	class Inner {
		void hello() {
			System.out.println(msg+"Welcome to Github");
		}
	}


	public static void main(String[] args) {

		
		memberInnerclass outer = new memberInnerclass();


		memberInnerclass.Inner innerObj = outer.new Inner();

		innerObj.hello();
	}
}
