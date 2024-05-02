package Interfaces;

//public class LambdaExperssionExample3 {

	import java.util.ArrayList;

	import java.util.Collections;

	import java.util.List;

	import java.util.stream.Collector;

	import java.util.stream.Collectors;

	import java.util.stream.Stream;

	class Product1{

	  int id;

	  String name;

	  float price;

	  public Product1(int id, String name, float price) {

	    super();

	    this.id = id;

	    this.name = name;

	    this.price = price;

	  }
	}

	public class LambdaExperssionExample3 {

	  public static void main(String[] args) {

	   List<Product> list=new ArrayList<>();

	   list.add(new Product(1,"HP Laptop",25000f));

	   list.add(new Product(2,"Dell Laptop",30000f));

	   list.add(new Product(3,"Lenevo Laptop",28000f));

	   list.add(new Product(4,"Sony Laptop",28000f));

	   list.add(new Product(5,"Apple Laptop",90000f));

	   double price= list.stream().collect(Collectors.summingDouble(p->p.price));

	   System.out.println(price);

	  }

	}
