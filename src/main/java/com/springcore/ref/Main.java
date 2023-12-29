package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext classPathXml = new ClassPathXmlApplicationContext("com/springcore/ref/config.xml");
		A a = (A) classPathXml.getBean("Aref");
		
		
		System.out.println(a.getX());
		System.out.println(a.getY());
		
		
		
		
	}

}
