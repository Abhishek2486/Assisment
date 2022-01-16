package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) 
	{
	        		Queue<String> Animals = new LinkedList<>();
	        		Animals.add("Lion");
	        		Animals.add("Tiger");
	        		Animals.add("cow");
	        		Animals.add("Snake");
	        		Animals.add("dog");
	               System.out.println("Queue of animals  : " + Animals);
	        		System.out.println("Head of Queue : " + Animals.peek());
	        		String a1=Animals.remove();
	        		System.out.println();
	        		System.out.println("After removing Head of Queue : " + Animals);
	        		System.out.println("Size of Queue : " + Animals.size());
	    	}

}
