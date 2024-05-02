package Inheritance;///specialization	

class Circle1///parent class
{
	public double radius;//property
	public double area()
	{
		return Math.PI*radius*radius;
		
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
		}
}
class Cylinder extends Circle1 {///child class which is an extension of circle class
	
	public double height;
	public double volume()
	{
		return area()*height;
	}

}

public class Circle{//main class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c=new Cylinder();
		c.radius =7;
		c.height =10;
		System.out.println("Area:"+c.area());
		System.out.println("Volume:"+c.volume());
	
	}

	
}
