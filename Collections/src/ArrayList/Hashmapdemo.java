package ArrayList;
//import java.util.*;
//public class Hashmapdemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Map<Integer, String> hm=new HashMap<>();
//		hm.put(1, "Dilip");
//		hm.put(2, "Sudha");
//		hm.put(3, "Saim");
//		
//		System.out.println(hm);
//		System.out.println(hm.containsKey(4));
//		System.out.println(hm.getClass());
//		System.out.println(hm.size());
//	
////		Set<Integer> s =hm.keySet();
////		for(Integer x:s)
////			{
////			System.out.println(s+" "+hm.get(x) );
////			}
////		
//		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
//			System.out.println("key:"+ entry.getKey()+",value:"+ entry.getValue());
//		}
//}
//}


//import java.util.*;
//class HashMapDemo{
//
//	public static void main(String[] args){
//	Map<Integer,String> hm= new HashMap<>();
//	hm.put(1,"Dilip");
//	hm.put(2,"Nikhil");
//	hm.put(null,"Sidhant");
//	hm.put(4,"Lokesh");
//	hm.put(5,"Pratik");
//	hm.put(9,"Dilip");
//
//	System.out.println(hm);
//}
//}




import java.util.*;
class HashMapDemo{

	public static void main(String[] args){
	HashMap<Integer,String> hm= new HashMap<>();
	hm.put(1,"Dilip");
	hm.put(2,"Nikhil");
	hm.put(null,"Sidhant");
	hm.put(4,"Lokesh");
	hm.put(5,"Pratik");
	hm.put(9,"Dilip");

	System.out.println(hm);

	for(Map.Entry<Integer, String> m: hm.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
