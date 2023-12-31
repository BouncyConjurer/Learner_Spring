package com.springcore.lifecycle.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext classPath = new ClassPathXmlApplicationContext("com/springcore/lifecycle/annotations/annoconfig.xml");
		
		Jupiter j1 = (Jupiter) classPath.getBean("jupiter");
		
		System.out.println(j1.toString());
		
	}

}
