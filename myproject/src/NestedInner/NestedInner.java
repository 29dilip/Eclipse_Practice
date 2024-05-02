package NestedInner;

class Outer// class
{
	int x=10;
	class Inner//nested class//
	{
		int y=20;
		public void InnerDisplay()//inner class can use the member of outer class//
		{
			System.out.println(x+ " " +y);
		}
	}
	public void OuterDisplay()///but for outer class to use member of inner class object is to be created//
	{
		Inner i= new Inner();//object of inner//
		i.InnerDisplay();
	}
}
public class NestedInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.OuterDisplay();
	}

}
