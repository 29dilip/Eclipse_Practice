package myproject;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Key: ");
		int key=sc.nextInt();
		int A[] = {2,3,4,33,444,5555,9033};
		for(int i=0; i<A.length; i++)
		{
			if(A[i]== key)
			{
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println("Key not Found");
	}
	
	

}
