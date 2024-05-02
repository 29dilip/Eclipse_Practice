package training;

import java.util.*;



public class Collection {

  public static void main(String a[]) {

    List al = new ArrayList();

    al.add(9); //parameter Object

    al.add(92);

    al.add("hello");

    al.add('k');

    al.add(null);

    al.add(59.78);

    al.add(92);

    System.out.println("arraylist size=" + al.size());

    for(int i=0; i<al.size(); i++) {

      System.out.println(al.get(i));

    }

    /* Object b[] = al.toArray();

    for(Object x: b)

    {

     System.out.println(x);

    }

    */

   // Collections.sort(al,Collections.reverseOrder());

    //int p=(Integer)al.get(0);

   /*Iterator it=al.iterator();//iterator() is a method from Collection interface implemented

       //by arraylist and it returns Iterator interface Object

    while(it.hasNext()) {//it returns true if it object has data

     Object x=it.next(); //it will return next element,initially first element

 System.out.println("arraylist data byusing iterator= " +x);

    }

*/

   /* Object ab[] = al.toArray();

    for(Object x: ab)

    {

     System.out.println(x);

    }

    for(int i =0; i<ab.length; i++) {

      System.out.println("toArray method "+ab[i]);

    }

    */

  }

}
