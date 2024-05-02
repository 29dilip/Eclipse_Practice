package Inheritance;///override

class Super
{
	public void Display()
	{
		System.out.println("Super Class Override");
	}
}

class Sub extends Super
{
	@Override
	public void Display()//override redefining same method
	{
		System.out.println("Sub class Override");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sup =new Sub();//object is called not the reference class
		sup.Display();
//		
//		Sub sub=new Sub();
//		sub.Display();
//		Super sup1= new Super();
//		sup1.Display();
	}

}
