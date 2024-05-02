package com.dilip.spring.springcore.lc.xmlConfig;

public class Patient {
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

}
