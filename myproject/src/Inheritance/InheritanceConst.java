package Inheritance;//constructor in inheritance

class Parent
{
	public Parent()//constructor
	{
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("Child Constructor");
	}
}
class GrandChild extends Child
{
	public GrandChild()
	{
		System.out.println("GrandChild Constructor");
	}
}
public class InheritanceConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild c=new GrandChild(); //calling the constructor//

	}

}
