package com.dilip.spring.springcore.lc.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/dilip/spring/springcore/lc/xmlConfig/lcConfig.xml");// xml file path name//
		Patient pat = (Patient) ctx.getBean("patient");// bean name//
		System.out.println(pat);
		ctx.registerShutdownHook();/// destroy method//

		// now for the destroy method to invoke there is abstract class for that
	}

}
