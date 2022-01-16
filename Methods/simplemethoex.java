package Methods;
//simple method
public class simplemethoex {
	public double divisionmeth(int a,int b) {
		double div=a/b;
		return div;
	}

	public static void main(String[] args) {

		simplemethoex d=new simplemethoex ();
		double ans = d.divisionmeth(10,3);
		System.out.println("division is :"+ans);
		}
}



