package com.dilip.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	Addition(int x,int y){
		System.out.println("Inside Constructor INT");
	}
	
	Addition(double x,double y){
		System.out.println("Inside Constructor Double");
	}
	
	Addition(String x,String y){
		System.out.println("Inside Constructor String");
	}

}
