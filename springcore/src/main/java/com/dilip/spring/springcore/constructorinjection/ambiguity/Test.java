package com.dilip.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/dilip/spring/springcore/constructorinjection/ambiguity/Config.xml");
		Addition e= (Addition) ctx.getBean("addition");
		System.out.println(e);
	}

}
