package com.dilip.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/map/mapConfig.xml");
		Customers customer = (Customers) ctx.getBean("customer");

		System.out.println(customer.getId());

		System.out.println(customer.getProducts());
	}

}
