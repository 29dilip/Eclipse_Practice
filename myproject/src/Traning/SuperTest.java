package myproject;


	public SuperTest() {
		// TODO Auto-generated constructor stub
	}class Base

{

 int a,b;

 void getData(int x,int y)

 {

 a=x;

 b=y;

 }

 void disp()

 {

 System.out.println("base class "+a+" "+b);

 }

}

class Der extends Base

{

 int a;

 int b;

 void assignData(int x,int y)

 {

 a=x;

 b=y;

 }

 void disp()

 {

 super.disp();

 System.out.println("der class "+a+" "+b);

 int total=super.a+super.b+a+b;

 System.out.println("total is "+total);

 }

}//class

class SuperTest

{

 public static void main(String args[])

 {

 Der d=new Der();

 d.getData(4,5);

 d.assignData(6,7);

 d.disp();

 }//main

}//class




