package AbstractClass;

abstract class Shape1
{
	abstract public double perimeter();
	abstract public double area();
	
}
class Rectangle extends Shape1
{
	double length;
	double breadth;
	@Override
	public double perimeter()
	{
		return 	2*(length*breadth);
	}
	public double area()
	{
		return length*breadth;
		
	}
}

public class AbstractClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.length=10;
		r.breadth=5;
		Shape1 s=r;
		System.out.println("AREA OF RECTANGLE: " +r.area());
		System.out.println("PERIMETER OF RECTANGLE: " +r.perimeter() );
	}

}
