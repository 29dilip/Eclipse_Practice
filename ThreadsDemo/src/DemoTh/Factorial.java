package DemoTh;

public class Factorial {
	
	
	public static long factorial(int number) {
		if(number <=1) {
			return 1;
		}
		else {
			return number*factorial(number-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			System.out.println(factorial(n));
	}

}
