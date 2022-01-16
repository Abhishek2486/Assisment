package Methods;

public class methodOverloding {
	
static int method1(int a,int b)
    {
         return a+b;
    }
static double method1(double a,double b){
        return a*b;
    }

    public static void main(String args[])
   {

   int m1=method1(23,54);
   double m2=method1(32.3,23.3);
   System.out.println("integer:"+m1);
   System.out.println("double:"+m2);
   }


}
