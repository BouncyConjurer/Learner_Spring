package com.springcore.lifecycle.xml;


public class Pepsi {
	
	
	private String string;

	public void init() {
		
		System.out.println("Inside Init");
		
	}
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "Pepsi [String=" + string + "]";
	}
	
	public void destroy() {
		
		System.out.println("Bean lifecycle ended");
		
	}

}
