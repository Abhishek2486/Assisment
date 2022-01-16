package Innerclass;

interface TestAbstractClass {
	 void display();
}


public class AnonymousInnerclass {
	public static void main(String[] args) {
		TestAbstractClass obj = new TestAbstractClass() {

			@Override
			public void display() {
				System.out.println("Hello! Welcome to github");

			}
		};
		obj.display();
	}
}

