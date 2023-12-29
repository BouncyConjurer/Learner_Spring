package com.springcore.ci;

import java.util.List;

public class Person {
	
	private int human1;
	private String dog;
	private Friend human2;
	private List<String> list;

	public Person(int human1, String dog, Friend human2, List<String> list) {
		super();
		this.human1 = human1;
		this.dog = dog;
		this.human2 = human2;
		this.list =list;
	}

	@Override
	public String toString() {
		return "Person [human1=" + human1 + ", dog=" + dog + ", human2=" + human2 + ", list=" + list + "]";
	}
}
