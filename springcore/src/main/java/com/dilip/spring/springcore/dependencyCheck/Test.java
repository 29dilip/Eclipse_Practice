package com.dilip.spring.springcore.dependencyCheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/dependencyCheck/DcConfig.xml");// xml file path name//
		Prescription prescription = (Prescription) ctx.getBean("prescription");// bean name//
		System.out.println(prescription);
		//RequiredAnnotationBeanPostProcessor//its used particular annotation//
	}

}
