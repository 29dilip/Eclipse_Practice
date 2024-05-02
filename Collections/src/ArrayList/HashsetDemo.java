package ArrayList;
import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
		hs.add("B");//set is sorted using HashCode//
		hs.add("d");
		hs.add("w");
		hs.add("c");
		hs.add("A");
		hs.add("l");
		
		for(String x:hs) {
			System.out.println(x);
		}
		
	}

}
