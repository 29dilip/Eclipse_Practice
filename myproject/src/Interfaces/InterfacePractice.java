package Interfaces;

interface Test///it is like abstract class only but syntax is different///
{
	void meth1();//abstract methods//
	void Meth2();
	
}
class Kela implements Test// instead of extend
{
	public void meth1() //override of abstract methods in sub class///
	{
		System.out.println("Meth1 of Kela");
	}
	public void Meth2()
	{
		System.out.println("Meth2 of Kela");
	}
}
public class InterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Kela();
		t.meth1();
		t.Meth2();
	}

}
