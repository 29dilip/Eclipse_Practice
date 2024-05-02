package com.dilip.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/list/listConfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");

		System.out.println(hospital.getName());

		System.out.println(hospital.getDepartments());
	}

}
