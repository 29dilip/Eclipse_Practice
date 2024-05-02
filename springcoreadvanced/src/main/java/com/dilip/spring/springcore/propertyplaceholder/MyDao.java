package com.dilip.spring.springcore.propertyplaceholder;

public class MyDao {

	private String server;

	public MyDao(String server) {
		super();
		this.server = server;
	}
	@Override
	public String toString() {
		return "MyDao [server=" + server + "]";
	}
}
