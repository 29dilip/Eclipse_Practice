package DemoTh;

@FunctionalInterface //--which have only one abstract method///
interface C{
	 abstract void show();// single abstract method// interface object cannot be created//
}

//class D implements C{
//	@Override
//	public void show() {
//		System.out.println("Hi it is an Overidden Abstract Method");
//	}
//}


public class LambaExp {
	public static void main(String[] args) {
//		C obj=new C();//cannot make object of interface//
		
//		C obj =new D(); //this is possible//
//		obj.show();
		
//		C obj = new C(){					/// this is called anonymous inner class not necessary to make
//			public void show() {				//another class to implement interface//
//				System.out.println("hi");
//			}
//		};
//		obj.show();
		
		
		C obj = () ->System.out.println("Lamba Expression");///lamba Expression///
		obj.show();
}
}
