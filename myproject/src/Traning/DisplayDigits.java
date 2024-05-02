package myproject;
import java.util.*;
public class DisplayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n=sc.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.println(r);
		}
	}

}
