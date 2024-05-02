package com.dilip.spring.springcore.reftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/reftype/reftypeConfig.xml");
		Student student = (Student) ctx.getBean("student");

		System.out.println(student);
	}

}
