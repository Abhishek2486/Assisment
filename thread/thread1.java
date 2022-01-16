package thread;

public class thread1 extends Thread {
	 public void start() {
		 System.out.println("my thread is running");
		
	}
	 public static void main(String[] args) {
		thread1 t1=new thread1();
		t1.start();
		
	}

}
