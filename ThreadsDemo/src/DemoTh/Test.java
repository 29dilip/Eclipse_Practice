package DemoTh;

class MyThead implements Runnable{///Thread using Interface///
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("Thread A is Running");
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThead m= new MyThead();
		Thread th= new Thread(m);
		th.start();
		for(int i=0; i<1000; i++) {
			System.out.println("Thread B is Running");
		}
	}

}
