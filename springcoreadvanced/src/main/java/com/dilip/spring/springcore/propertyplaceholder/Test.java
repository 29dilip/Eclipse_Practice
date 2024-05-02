package com.dilip.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/dilip/spring/springcore/propertyplaceholder/config.xml");
		MyDao m=(MyDao) ctx.getBean("mydao");
		System.out.println(m);
	}

}
