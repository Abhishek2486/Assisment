package Constructor;
//parameterized constructor
public class empEnfo {
	int id;
	String name;
	String email;

	empEnfo(int i,String n,String e)
	{
	id=i;
	name=n;
	email=e;
	}

	void display() {
	System.out.println(id+" "+name+" "+email);
	}



public static void main(String[] args) {

	empEnfo emp1=new empEnfo(245361,"Alex","alex142@ss.com");
    empEnfo emp2=new empEnfo(245362,"Tony","tony4525@ss.com");
	emp1.display();
	emp2.display();
		}
}



