package myproject;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max1,max2;
		int A[]= {3,9,7,8,122,6,155,5,4,10};
	    max1=max2= A[0];
	    for(int i=0;i<A.length;i++)
	    {
	    	if(A[i]> max1)
	    	{
	    		max2=max1;
	    		max1=A[i];
	    		
	    	}
	    	else if (A[i]> max2)
	    	{
	    		max2=A[i];
	    	
	    	}
	    		
	    }
	    System.out.println("Second Largest number is "+max2);
	}

}
