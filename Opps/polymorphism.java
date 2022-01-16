package Opps;

public class polymorphism {
    public int  polymorphism(int x, int y) 
    { 
        return (x + y); 
    } 
    public int  polymorphism(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double polymorphism (double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	 polymorphism s = new  polymorphism(); 
        System.out.println(s. polymorphism(15, 20)); 
        System.out.println(s. polymorphism(10.0, 30)); 
        System.out.println(s. polymorphism(10.5, 27.5)); 
    } 

}
