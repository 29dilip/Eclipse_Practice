package com.dilip.spring.springcore.lc.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/lc/annotation/annoConfig.xml");// xml file path name//
		Patient pat = (Patient) ctx.getBean("patient");// bean name//
		System.out.println(pat);
		ctx.registerShutdownHook();/// destroy method//
		
//		CommonAnnotationBeanPostProcessor//for getting the annotation using it xml and make a instance of it..//

		// now for the destroy method to invoke there is abstract class for that
	}

}
