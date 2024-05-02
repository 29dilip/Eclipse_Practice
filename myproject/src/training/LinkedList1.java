package training;

import java.util.*;

public class LinkedList1{

 public static void main(String args[]){

 List <String>al=new LinkedList<>(); // It uses Generic concept it will accept only String

    //if use list without <String> it will accept any Object of any type

 al.add("Ravi");

 al.add("Vijay");

 al.add("Ravi");

 boolean x= al.add("Ajay");

 System.out.println(x); //allways true

 al.add(1,"Hello");

 al.remove(3);

 //*///

 //al.add(99);

 /*Iterator <String>itr=al.iterator();

 while(itr.hasNext()){

 String s=itr.next();

  System.out.println(s);

 } */

  /*Object a[]=al.toArray();

  for(Object y: a)

  {

   System.out.println((String)y);

  }*/

 Iterator<String> it=al.iterator();

  while(it.hasNext())

  {

  System.out.println(it.next());

  }

 }

}














