package Opps;

 //Abstract class
	abstract class Animal {
		  public abstract void animalSound();
		  public void sleep() {
		    System.out.println("sss");
		  }
		}

		class tiger extends Animal {
		  public void animalSound() {
		    System.out.println("The tiger says: roorrss");
		  }
		}

		 public class wild{
		  public static void main(String[] args) {
		   tiger Tiger=new tiger(); 
		    Tiger.animalSound();
		    Tiger.sleep();
		  }
		}

