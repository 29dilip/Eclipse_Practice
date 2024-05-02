package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class studentMain {

	public static void main(String[] args) {
		studentss std1 = new studentss("Dilip",1,45);
		studentss std2 = new studentss("Shivam",2,40);
		studentss std3 = new studentss("Sh",3,90);
		List<studentss> lst = new ArrayList<>();
		lst.add(std1);
		lst.add(std2);
		lst.add(std3);
		lst.stream().forEach(x -> System.out.println(x.name));
		Collections.sort(lst);
		System.out.println("=============================");
		lst.stream().forEach(x -> System.out.println(x.name));
		
		Comparator<studentss> cpr = new Comparator<>() {//has compare() method to oveeride //it is in java.util.package//
			
			@Override
			public int compare(studentss o1, studentss o2) {
				if(o1.marks>o2.marks) {
					return 1;
				}
				else if(o1.marks==o2.marks){
					return 0;
				}
				
				return -1;
			}
		};
		System.out.println("=============================");
		lst.stream().forEach(x -> System.out.println(x.marks));
		Collections.sort(lst,cpr);
		System.out.println("=============================");
		lst.stream().forEach(x -> System.out.println(x.marks));
		
		

	}

}
