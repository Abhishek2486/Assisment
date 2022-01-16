package Exception3;
class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}

public class NewDemo {
	   public static void main(String args[]){
			try{
				
				
				throw new MyException(" error Message");
			}
			catch(MyException exp){
				
				System.out.println(exp) ;
			}
		   }

}
