package Exception;

public class ExceptionDemo1 {

	static int Meth1() {
		return 20/0;
	}
	static void Meth2() {
		Meth1();
	}
	static void Meth3() {
		Meth2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Meth3();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
