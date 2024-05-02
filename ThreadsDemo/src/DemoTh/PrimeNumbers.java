package DemoTh;

public class PrimeNumbers {
	public static boolean isPrime(int x) {
		if(x<=1) {
			return false;
		}
		for(int i=2; i<Math.sqrt(x)+1; i++) {
			if(x %i==0) {
				return false;
			}	
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,4,5,6,7,99,82,23,34,17,3};
		for( int x:arr) {
			if(isPrime(x)) {
				System.out.println(x);
			}
		}
	}
	

}
