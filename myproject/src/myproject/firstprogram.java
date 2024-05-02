package myproject;

public class firstprogram {	
	int x=111;//instance variable
	public static void main(String[] args) {
		int i=5;
		System.out.println(i);
		firstprogram ob=new firstprogram();
		System.out.println(ob.x);
		ob.display();
	}
	void display()
	{
		System.out.println("x value="+x);
	}
}