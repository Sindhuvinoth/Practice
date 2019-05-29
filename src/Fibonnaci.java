
public class Fibonnaci {

	public static void main(String[] args) {
		System.out.println(febNum(2));
		
	}
	public static int febNum(int feb){
		//int result = 0;
		/*int feb;
		 int feb1 = 0;
		 int feb2 = 1;
		 System.out.println("Feb numbers are \n" + feb1 );
			System.out.println("Feb numbers are \n" + feb2 ); */
		//for(feb=0;feb<=20; feb++) {
			if(feb == 0) {
				return 0;
				
			}else if(feb == 1) {
			return 1;
			}else {  
				return((febNum(feb - 1) ) + (febNum(feb - 2)));
			
		/*feb = feb1 + feb2;
		System.out.println("Feb numbers are \n" + feb );
		feb1 = feb2;
		feb2 = feb; */
			}
		
	}

}
