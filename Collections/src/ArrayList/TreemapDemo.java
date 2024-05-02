package ArrayList;
import java.util.*;
import java.util.Set;
public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "Dilip");
		tm.put(2, "Nikhil");
		tm.put(3,"Snehasish");
		tm.put(4, "Saim");
		tm.put(5, "Kaushal");
		
		System.out.println(tm.get(5));
		System.out.println(tm.descendingMap());
		System.out.println(tm);
		System.out.println(tm.size());
		}
		
//		Set<Integer> Keys=tm.keySet();
		
	}

