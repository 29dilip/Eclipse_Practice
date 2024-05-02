package ArrayList;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("A");//order id maitained//
		lhs.add("D");
		lhs.add("V");
		lhs.add("C");
		lhs.add("A");
		lhs.add("Q");
		
		for(String X:lhs) {
			System.out.println(X);
		}
		
	}

}
