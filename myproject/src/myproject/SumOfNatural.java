package myproject;
import java.util.*;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Natural number:");
		int n= sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of natural no "+n+" is :" +sum);
	} 

}
