package myproject;

public class constructor {
	class TestBase

	{

	 TestBase()

	 {

	 System.out.println("base class constructor");

	 }

	 void m1()

	 {

	 System.out.println("m1 method");

	 }

	}

	public class TestDer extends TestBase

	{

	  TestDer()

	 {

	 System.out.println("der class Constructor");

	 }

	 public static void main(String[] args)

	 {

	 System.out.println("before object creation");

	  TestDer ob=new TestDer();

	  ob.m1();

	 }//main

	}//class




}
