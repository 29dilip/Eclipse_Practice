package DemoTh;

class A extends Thread 
{
	public void run() {
	for(int i=0;i<100;i++)
	{
	
		System.out.println("Thread A is running");
	}
	}
}

class B extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Thread B is running");
		}
	}
}
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a = new A();
			B b = new B();
			a.start();
			b.start();
			
			
	}

}

