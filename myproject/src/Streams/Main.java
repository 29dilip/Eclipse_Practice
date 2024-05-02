package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Avantika", 50000), 
				new Employee(2, "Dilip", 40000),
				new Employee(3, "Swamy", 60000));

		System.out.println(employees);

		List<Employee> sortedEmployees = employees.stream()
				.sorted(Comparator.comparing(Employee::getName,Comparator.reverseOrder()))
				.collect(Collectors.toList());

		sortedEmployees.forEach(System.out::println);
		sortedEmployees.forEach(x -> System.out.println(x));
		
//		Iterator<Employee> itr= employees.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//			
//			
//			
//		}
		
	}
}
