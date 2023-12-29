package com.springcore.lifecycle.xml;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext classPath = new ClassPathXmlApplicationContext("com/springcore/lifecycle/xml/lifecycleconfig.xml");
		Pepsi p1 = (Pepsi) classPath.getBean("pepsi");
		System.out.println(p1);
		
		/** In Spring, the registerShutdownHook() method is part of the
		 *  AbstractApplicationContext class, which is an abstract implementation
		 *   of the ApplicationContext interface. This method is used to register a
		 *    shutdown hook with the JVM, allowing the Spring application context to
		 *     perform cleanup operations when the JVM is shutting down.*/
		classPath.registerShutdownHook(); // using it will call the  destroy method
		
	}
}
