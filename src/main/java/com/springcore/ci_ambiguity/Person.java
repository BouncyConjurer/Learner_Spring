package com.springcore.ci_ambiguity;

public class Person {
	
	private int a;
	private int b;
	
	public Person(int a, int b) {
		
		this.a=a;
		this.b=b;
		
	}
	
	public Person(double a,double b) {
		
		this.a =(int) a;
		this.b =(int) b;
	}

	public Person(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	

}
