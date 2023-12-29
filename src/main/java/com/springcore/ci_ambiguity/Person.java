package com.springcore.ci_ambiguity;

public class Person {
	
	private int a;
	private int b;
	
	/** Ambiguity in constructor injection: It occurs when the Spring IoC (Inversion of Control) container
	 *  encounters a situation where it cannot determine which constructor to use for dependency injection.
	 *  This typically happens when a class has multiple constructors, and there's no clear indication of 
	 *  which one should be used. If multiple constructors are present IoC will consider the one with 
	 *  String parameters if it's not present then it will use the one which it will encounter first(top most).
	 *  
	 *  To solve this issue, set type of the values you want inject using type tag.
	 *  */
	
	
	public Person(int a, int b) {
		System.err.println("Int Constructor");
		this.a=a;
		this.b=b;
	}
	
	public Person(double a,double b) {
		System.out.println("Double Constructor");
		this.a =(int) a;
		this.b =(int) b;
	}

	public Person(String a, String b) {
		System.out.println("String Constructor");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	@Override
	public String toString() {
		return "Person [a=" + a + ", b=" + b + "]";
	}
	

}
