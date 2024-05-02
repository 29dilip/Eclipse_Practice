package ArrayList;
import java.util.*;
public class HashTablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht= new Hashtable<>();//without generics it will work
		ht.put(4, "hello");//inserted element is displayed using hash function//
		ht.put(2, "Dilip");
		ht.put(1,"Sharma");
		
		System.out.println(ht);
	}

}
