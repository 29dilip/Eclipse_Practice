package com.dilip.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/dilip/spring/springcore/Config.xml");
		Employee emp=(Employee) ctx.getBean("emp");
		System.out.println("Employee ID:" +emp.getId());
		System.out.println("Employee Name:" + emp.getName());
	}

}
