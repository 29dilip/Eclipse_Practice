package DemoTh;
import java.util.*;
public class Stream {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(2);
		arr.add(13);
		arr.add(24);
		arr.add(2);
		arr.add(4);
		arr.add(67);
		arr.add(88);
		arr.add(90);
		arr.add(47);
		arr.add(35);
		
		arr.stream().distinct().sorted(Collections.reverseOrder()).forEach(x -> System.out.println(x));
		System.out.println("------------------------------------------");
		arr.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("===============================================");
		System.out.println(arr.stream().count());
		System.out.println("=================================================");
		arr.stream().filter(x -> x%2==0).map(x -> x*x).forEach(x -> System.out.println(x));
		
	}

}
