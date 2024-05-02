package ArrayList;
import java.util.*;
public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>();//it is set which is sorted set in ascending order by deafault//
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(80);
		ts.add(50);
		ts.add(10);
	
		System.out.println(ts.descendingSet());
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===========================");
		for(int x:ts) {
			System.out.println(x);
		}
		
	}

}
