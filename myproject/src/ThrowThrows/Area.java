//import java.io.*;

package ThrowThrows;

class NegativeIntegerException extends Exception{
	public String toString()
	{
		return("Dimensions cannot be negative");
		
	}
}
public class Area {
	
	static int area(int l, int b) throws NegativeIntegerException {
		if(l<0||b<0)
			throw new NegativeIntegerException();//user-defined Exception 
		return l*b;
	}
	static void meth1() throws NegativeIntegerException {
		System.out.println("Area is : " +area(-10, 5));
	}
	

	public static void main(String[] args) throws NegativeIntegerException {
		// TODO Auto-generated method stub
		try
		{
		meth1();
		}
		catch(NegativeIntegerException e)
		{
			System.out.println(e);
		}
	}

}
