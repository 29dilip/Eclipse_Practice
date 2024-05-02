package com.dilip.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/properties/propertiesConfig.xml");
		Languages language = (Languages) ctx.getBean("languages");

		System.out.println(language.getLanguages());
	}

}
