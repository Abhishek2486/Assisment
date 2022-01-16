package Constructor;
//default constructor
public class studentemfo {
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}



public static void main(String[] args) {

	studentemfo emp1=new studentemfo ();
	studentemfo  emp2=new studentemfo ();

	emp1.display();
	emp2.display();
	}
}



