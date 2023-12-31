package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandMain {
	
	public static void main(String[] args) {
		
		ApplicationContext classPath = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standconfig.xml");
		
		Person p1 =classPath.getBean("person",Person.class);
		
		System.out.println(p1.getGames());
		System.out.println(p1.getGames().getClass().getName());
		
		System.out.println(p1.getSpecs());
		System.out.println(p1.getSpecs().getClass().getName());
		
		System.out.println(p1.getLand());
		System.out.println(p1.getLand().getClass().getName());
		
	}
}
