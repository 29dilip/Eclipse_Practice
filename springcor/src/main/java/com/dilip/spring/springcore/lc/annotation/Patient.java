package com.dilip.spring.springcore.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {//implementing interfaces
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
	
	@PostConstruct
	public void hi() {//init method//
		System.out.println("Inside hi method");
	}
	
	@PreDestroy
	public void bye() {//destroy method//
		System.out.println("Inside bye method");
	}


}
