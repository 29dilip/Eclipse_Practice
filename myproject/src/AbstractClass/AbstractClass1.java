package AbstractClass;

abstract class Shape
{
	abstract public double Perimeter();
	abstract public double Area();
	
	
}
class Circle extends Shape
{
	double radius;
	@Override
	public double Perimeter()
	{
		return 2*Math.PI*radius;
	}
	@Override
	public double Area()
	{
		return Math.PI*radius*radius;
	}
	
	
	
}
public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Circle c=new Circle();
		
		Circle c=new Circle();
		c.radius=8;
		Shape s=c;
		System.out.println("AREA: " +s.Area());
		System.out.println("PERIMETER: " +s.Perimeter());	
		
	
}

}
