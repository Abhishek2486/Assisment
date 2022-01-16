package accesmodifier;

public class PrivateAccessModifier extends Student1 {
	 public static void main(String args[]){
         
         Student obj = new Student();

    
         System.out.println(obj.rollNo);

         obj.showRollNo();
  }
}
