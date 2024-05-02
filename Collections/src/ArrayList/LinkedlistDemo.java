package ArrayList;
import java.util.*;
public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<>();//it is a ordered list//
		l.add(12);								//it takes dupliCates object//
		l.add(0, 10);
		l.addFirst(130);
		l.addLast(200);
		System.out.println(l.contains(10));
		
		Iterator<Integer> it=l.iterator();
		while(it.hasNext()) {
			int i=it.next();
			System.out.println(i+ " ");
		}
		
//		
}
}
