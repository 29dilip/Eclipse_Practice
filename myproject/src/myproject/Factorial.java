package myproject;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact=fact*i;
			
		}
		System.out.println("The factorial of "+n+" is :" +fact);
	}	
}
