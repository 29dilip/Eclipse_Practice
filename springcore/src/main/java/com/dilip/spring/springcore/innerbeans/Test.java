package com.dilip.spring.springcore.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/innerbeans/InnerBeansConfig.xml");// xml file path name//
		Employee emp = (Employee) ctx.getBean("employee");// bean name//
		System.out.println(emp.hashCode());
		
		Employee emp2 = (Employee) ctx.getBean("employee");// bean name//
		System.out.println(emp2.hashCode());
	}
}
