package ArrayList;
import java.util.*;
public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashSet<Integer> h=new HashSet<>();///set using hashset class//
												//set does not take duplicates//
			h.add(10);
			h.add(20);
			h.add(30);
			h.add(10);
			System.out.println(h);
			
			Iterator<Integer> itr = h.iterator();
			while(itr.hasNext()){
				int i= itr.next();
				System.out.println(i+" ");
				
//			System.out.println("Minimum value is "+Collections.min(h));
//			System.out.println("Maximum value is "+Collections.max(h));
			}
	}

}
