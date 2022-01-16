package accesmodifier;
class Student {
   
    int rollNo = 5;

    void showRollNo(){
         System.out.println("RollNo = " + rollNo);
    }
}
public class DefaultAccessModifier1 {
	  public static void main(String args[]){
          
          Student obj = new Student();

          System.out.println(obj.rollNo);
          obj.showRollNo();
    }
}
