package com.springcore.autowired.annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext classPath = new ClassPathXmlApplicationContext("com/springcore/autowired/annotations/autoanno.xml");
		
		Aadmi a1 = classPath.getBean("aadmi", Aadmi.class);
		
		System.out.println(a1);
	}
	
	
}
