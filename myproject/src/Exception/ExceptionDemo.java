package Exception;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
	//try & catch For exception Handling//////we can use try & finally block
	// but not with alone finally block//
	
		try {	
		c= a/b;
		System.out.println("Divison is " +c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divison  by Zero is not allowed, try again...");
		}
		///this will print irrespective of exception///
		
		finally{
			System.out.println("BYE");
		}
//		System.out.exit(0);
		
	}
		
 
}
