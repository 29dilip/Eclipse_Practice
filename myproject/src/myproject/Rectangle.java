package myproject;

class Rectangle1
{
	public double length;
	public double breadth;
	
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length*breadth);
	}
	public boolean isSqaure()
	{
		if(length==breadth)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Rectangle
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Rectangle1 r1= new Rectangle1();
			r1.length=12.5;
			r1.breadth=12.5;
			System.out.println("AREA IS :"+r1.area());
			System.out.println("PERIMETER IS :"+r1.perimeter());
			System.out.println("RECTANGLE IS A SQUARE :"+r1.isSqaure());
			
			
	}

}
