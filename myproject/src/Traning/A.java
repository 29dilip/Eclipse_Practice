package Traning;

class A

{

 public void x()

 {

 System.out.println("x of A class");

 }

}

class B extends A

{

 public void x()

 {

 System.out.println("x of B class");

 }

 public void y()

 {

 System.out.println("y of B class");

 }

}

class C extends A

{

 public void x()

 {

 System.out.println("x of c class");

 }

 public void z()

 {

 System.out.println("z of c class");

 }

}

public class BaseRefTest

{

 public static void main(String args[])

 {

 A a=new A();

 a.x();

 a=new B();

 a.x();

  a=new C();

 a.x();

     //System.out.println("hello");

  //B b=new C();

 }

}





























}
