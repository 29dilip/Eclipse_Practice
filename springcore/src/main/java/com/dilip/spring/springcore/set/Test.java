package com.dilip.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/set/setConfig.xml");
		CarDealer hospital = (CarDealer) ctx.getBean("cardealer");

		System.out.println(hospital.getName());

		System.out.println(hospital.getModels());
	}

}
