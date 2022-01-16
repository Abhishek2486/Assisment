package Methods;
//call by value example
public class callBy {
	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		callBy d = new callBy();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(50);
		System.out.println("After operation value of data is "+d.val);
		}
	}


