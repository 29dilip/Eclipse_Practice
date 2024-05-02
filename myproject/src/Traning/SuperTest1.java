package myproject;


	class TestBase

	{

	 int a,b;

	TestBase()

	 {

	 System.out.println("Zero-args constructor base");

	 }

	 TestBase(int x,int y)

	 {

	 a=x;

	 b=y;

	 System.out.println("param construcotr of base");

	 }

	 void disp()

	 {

	 System.out.println("base class "+a+" "+b);

	 }

	}

	class TestDer extends TestBase

	{

	 int c;

	 int d;

	TestDer()

	 {

	 System.out.println("zero-arg con in der ");

	 }

	TestDer(int x,int y,int z,int dx)

	 {

	 super(x,y);

	 c=z;

	 d=dx;

	 System.out.println("param con -der class");

	 }

	 void disp()

	 {

	 super.disp();

	 System.out.println("der class "+c+" "+d);

	 }

	}//class

	class SuperTest1

	{

	 public static void main(String args[])

	 {

	 TestDer d=new TestDer(4,5,6,8);

	 d.disp();

	 }//main

	}//class
