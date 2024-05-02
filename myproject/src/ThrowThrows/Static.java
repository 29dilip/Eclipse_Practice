package ThrowThrows;

class Test3{
	
	static//static block
	{
		System.out.println("Block 1");
	}
	static//static block is printed first//
	{
		System.out.println("Block 2");
	}
}
public class Static {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		Test3 t= new Test3();
	}
	

}
