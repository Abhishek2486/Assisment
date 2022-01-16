package Arrays;

public class createArraysExample {

	public static void main(String[] args) {

		//Single dimentional Array
		System.out.println("single dimentional");
		int a[]= {1,2,3,4,5,};
		for(int i=0;i<=5;i++) {
		System.out.println("Elements of array a: "+i);
		}
		System.out.println("print the String");
		String b[]= {"computer","mouse","laptop"};
	    for (String p: b) {
	    System.out.println(p);
		
	    
	    //multi dimentional array
	    int[][] x= {{1,2,3,4,5},
	    		{6,7,8,9,10,11}};
	    for(int i=0;i<x.length;i++) {
	    	for(int j=0;j<x[i].length;j++) {
	    		System.out.println(x[i][j]);
	    	}
	    }
	    System.out.println("length of each row "+x[0].length);
	   System.out.println("length of each row "+x[1].length);
	    	}
	    }
	

}

