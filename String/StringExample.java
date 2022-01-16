package String;

public class StringExample {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println(sl.length());

		//substring
		System.out.println("substring");
		String sub=new String("hello");
		System.out.println(sub.substring(2));

		//String Comparison
		System.out.println("String comparison");
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		System.out.println("string is empty");
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		System.out.println("string is replece");
		String s6="treana";
		String replace=s6.replace('a', 'd');
		System.out.println(replace);

		//equals
		System.out.println("equals");
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		System.out.println("insert method");
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		System.out.println("replace method");
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		System.out.println("delete method");
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("sankranthi");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}


}
