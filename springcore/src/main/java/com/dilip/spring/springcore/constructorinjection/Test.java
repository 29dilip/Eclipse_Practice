package com.dilip.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/dilip/spring/springcore/constructorinjection/cinConfig.xml");
		Employee e= (Employee) ctx.getBean("employee");
		System.out.println(e);
	}

}
