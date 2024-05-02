package com.dilip.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {//implementing interfaces
	private int id;

	public int getId() {
		return id;
		
	}


	public void setId(int id) {
		this.id = id;
		System.out.println("inside setter method");
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	public void hi() {//init method//
		System.out.println("Inside hi method");
	}
	
	public void bye() {//destroy method//
		System.out.println("Inside bye method");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet");
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Destroy");
		
	}

}
