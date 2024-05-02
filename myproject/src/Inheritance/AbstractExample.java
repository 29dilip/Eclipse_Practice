package Inheritance;

abstract class Supers//abstract class
{
	public Supers() {System.out.println("Super Constructor");}
	public void Meth1()
	{
		System.out.println("Super Method");
	}
	abstract public void Meth2();// abstract method
}
class Subs extends Supers//concrete class
{
	public void Meth2()
	{
		System.out.println("Sub Meth2");///for taking abstract method
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supers s=new Subs();//abstract class obj cannot be created///
		s.Meth1();
		s.Meth2();
	}

}
