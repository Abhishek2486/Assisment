package Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("Piyush");
		stack.push("Alex");
		stack.push("Scott");
		stack.push("Dhruvik");
		stack.push("Vinay");
		
        System.out.println(stack+"is insert to Stack");
		String s1 = stack.pop();
		System.out.println(s1+"   is remove from stack");
		System.out.println(stack +"  after removal of stack");
	}
}	
