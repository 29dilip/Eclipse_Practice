package myproject;

class Circle // class which have design
{
	public double radius; /// properties of class
	public double area() // this are the methods of the class
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

public class Circle1 {

	public static void main(String[] args)// main method
	{
		// TODO Auto-generated method stub
		Circle c1=new Circle(); // object created in heap
		c1.radius=9;
		System.out.println("Area : "+c1.area());
		System.out.println("Circumference :"+c1.circumference());
		System.out.println("Perimeter : "+c1.perimeter());
		

	}

}
