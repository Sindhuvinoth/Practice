
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number={17, -2, 0, -10, 10};
		System.out.println("Min =" + arrayMin(number));
		System.out.println("Max =" + arrayMax(number));
		System.out.println("Avg =" + arrayAvg(number));



	}
	public static int arrayMin(int[] arr) {
		int min = arr[0];
		for (int i=0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i]; 
			}
		}
		return min;
		
	}
	public static int arrayMax(int[] arr) {
		int max = arr[0];
		for (int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; 
			}
		}
		return max;
		
	}
	public static int arrayAvg(int[] arr) {
		int sum = 0;
		//int avg = arr[0];
		for (int i=0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		return sum/arr.length;
		
	}

}
