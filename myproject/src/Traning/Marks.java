package myproject;


    class Marks

    {

   int m1,m2,m3;

 Marks()

 {

  System.out.println("marks class constructor");

 }

      void get(int x,int y,int m3)

      {

       m1=x;

       m2=y;

      this.m3=m3;

      System.out.println("Marks class get()");

      }

      void disp()

      {

       System.out.println("marks are");

      System.out.println(m1+" "+m2+" "+m3);

      }

}//marks class

  class Student extends Marks

   {

    int sno;

    String sname;

    int total;

    float avg;

 Student()

 {

  System.out.println("Student class Constructor");

 }

    void get(int sno,String sname)

    {

      this.sno=sno;

      this.sname=sname;

    total=m1+m2+m3;

    avg=total/3.0f;

     System.out.println("Student class get()");

    }

    void disp()

     {

     System.out.println("name is "+sname);

     System.out.println("number is "+sno);

     //super.disp();// invokes base class disp();

     System.out.println("total is "+total);

     System.out.println("avg is "+avg);

     }

}//Student class

class Result extends Student

{

char grade;

String result;

Result()

{

System.out.println("Result class Constructor");

}

void find_Grade_Result()

{

if(avg<35)

{

 grade='N';

 result="fail";

}

else if(avg<50)

{

 grade='C';

 result="pass";

}

else if(avg<60)

{

 grade='B';

 result="pass";

}

else if(avg>=60 && avg<=100)

{

 grade='A';

 result="pass";

}

else

{

 System.out.println("Invalid marks ");

}

System.out.println("grade is "+grade);

System.out.println("result is "+result);

}//find result

}//Result class

public	class MLInhTest

{

public static void main(String args[])

  {

Result rs=new Result();

rs.get(67,89,67);

rs.get(101,"raja");

rs.disp();

rs.find_Grade_Result();

   }//main

}//MLInhTest



























