package myproject;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		System.out.println("The Sum of array element is: " +sum);
	}

}
