package ThrowThrows;
class test//final keyword restrict inheritance
{
	static void show() {
		System.out.println("final");
	}
}
class test1 extends test
{	//cannot override final methods
	static void show()
	{
		
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI=3.1425f;
		
	}

}
