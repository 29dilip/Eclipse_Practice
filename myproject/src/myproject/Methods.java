package myproject;

public class Methods 
{
	 
	static boolean isPrime(int n) //isPrime methods/// called method
	{
		  for(int i=2;i<n/2;i++)
		  {	
			  if(n%i==0)
				  return false;
		  }
		  return true;
	}		
		public static void main(String[] args)  //main method //calling the boolean method
		{
			if(isPrime(91))
			System.out.println("91 is prime Number");
		}
}
