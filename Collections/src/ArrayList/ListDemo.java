package ArrayList;
//import java.util.*;
//public class ListDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Integer> l = new ArrayList<>(20);
//		ArrayList<Integer> l1 =new ArrayList<>(List.of(20,30,405,23,34));
//		l.add(10);
//		l.add(10);
//		l.add(0, 30);
//		l.add(50);
//		l.addAll(1,l1);
//		
//
//	
//			
//		
//		for(Integer x:l)//inhance for loop or for each loop for traversing the elements in array//
//		{
//			System.out.println(x);
//		}
//		
//		
//       System.out.println("ArrayList: ");
//		System.out.println(l);
//	}
//
//}



import java.util.*;
class List{

	public static void main(String[] args){
	ArrayList<String> al= new ArrayList<>();
	al.add("Dilip");
	al.add("Saim");
	al.add("Sidhant");
	al.add("Nikhil");
	al.add("Lokesh");
	al.add("Pratik");
	al.add("Kaushal");

	System.out.println(al);
	System.out.println("==========================Lambda Expression");
	al.forEach(x ->System.out.println(x));
	System.out.println("========================== ForEach Loop");
	for(String c:al){
	System.out.println(c);
	}
	System.out.println("========================== Iterator");
	Iterator<String> itr= al.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
}
}