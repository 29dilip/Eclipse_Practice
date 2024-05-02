package Inheritance;

import java.util.*;

public class ArraysDemo {

public static void main(String a[])

{

  int s[]={10,9,2,3,5,99,9};

  for(int i=0;i<s.length;i++)

  {

    System.out.println(s[i]);

  }

  Arrays.sort(s);

  System.out.println("after sorting");

  for(int o:s)

  {

    System.out.println(o);

  }

  int i=Arrays.binarySearch(s,9);

  System.out.println("index value="+i);

  //removing duplicate elements in array

  /* String s1="javajkb";//javkb

  char x[]=s1.toCharArray();

  //int x[]={2,3,2,4,3};

  Set ob=new HashSet();

  for(char j:x)

   ob.add(j);

  System.out.println(ob.size());

  Object o[]=ob.toArray();

  for(Object k:o)

   System.out.print(k);

 */

}

}



