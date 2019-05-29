
public class Factorial {

	public static void main(String[] args) {
		//System.out.println("Factorial Numbers are \n");
     Factorial.sum(5);
     
	}
	public static void fact(){
		int fac;
		int fac1 = 1;
		int fac2 = 1;
		//System.out.println(fac1);
		for(fac = 1; fac < 10; fac++) {
			fac2 = fac * fac1;
			fac1 = fac2;
			System.out.println(fac1);
		}
		
	}
	public static void sum(int n) {
		int i;
		int sum1 = 0;
		for(i = 1; i <= n; ++i) {
			 sum1  += i;
		}
			 System.out.println(sum1);;
	
	}
	
	
	
}
