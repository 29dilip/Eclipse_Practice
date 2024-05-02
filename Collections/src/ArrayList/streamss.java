package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ArrayList<Integer> arg = new ArrayList<>();
		        arg.add(11);
		        arg.add(21);
		        arg.add(33);
		        arg.add(2);
		        arg.add(3);
		        arg.add(4);
		        arg.add(2);
		        arg.add(4);
		        arg.add(5);
		        arg.add(6);
		        arg.add(7);
		        arg.add(10);

		        arg.stream().filter(x -> x%2==0).map(x -> x*x).distinct().sorted(Collections.reverseOrder()).forEach(x -> System.out.print(x+" "));
		        System.out.println("-------------------------------------------------------");	
		        List<List<Integer>> arga = Arrays.asList(Arrays.asList(1,2,3,4,45),Arrays.asList(2,3,4,5,6,7,9),Arrays.asList(44,66,33,22,55,66,78,88));
		        System.out.println(arga);
		        System.out.println("------------------------------------------------------");
		        arga.stream().flatMap(List -> List.stream()).forEach(x -> System.out.print(x+" "));

		    }

	}


