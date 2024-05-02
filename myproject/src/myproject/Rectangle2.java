package myproject;

class RectangleTest
{
	//properties
	private double length;
	private double breadth;//data hiding by using private access modifier//
	
	//getter for properties of class
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	///setter for properties of class
	public void setLength(double l)
	{
		if (l>=0) ///validation
			length=l;
		else
			length=0;
	}
	public void setBreadth(double b)
	{
		if (b>=0)
			breadth=b;
		else
			breadth=0;
	}
	
	//methods
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

public class Rectangle2 //calling the methods from another class//
{
	//main method
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			RectangleTest r1= new RectangleTest();
			r1.setLength(13.5);
			r1.setBreadth(12.5);
			System.out.println("AREA IS :"+r1.area());
			System.out.println("PERIMETER IS :"+r1.perimeter());
			System.out.println("RECTANGLE IS A SQUARE :"+r1.isSqaure());
			System.out.println("Length :"+r1.getLength());
			System.out.println("Breadth :"+r1.getBreadth());
			
			
	}
}