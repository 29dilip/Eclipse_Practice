package ArrayList;
import java.util.*;
public class Pratice {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
//		Set<Integer> set= new HashSet<>();
		arr.add(100);
		arr.add(20);
		arr.add(300);
		arr.add(140);
		arr.add(100);
		
//		for(int x:arr) {
//			set.add(x);
////			System.out.println(x);
//		}
		
//		arr.forEach(n -> System.out.println(n));// lamba expression for tranversing//
		
		Iterator<Integer> itr= arr.iterator();
		while(itr.hasNext()) {
			int i= itr.next();
			System.out.println(i);
		}///using iterator//
	
		
//		int i= arr.size();
//		Collections.sort(arr);
		System.out.println(arr);
//		System.out.println(set);//using set to remove duplicate//
//		System.out.println(arr.get(i-2));///get second largest element from list//
	}

}
