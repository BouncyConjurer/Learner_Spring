package com.springcore.ci;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext classPathXml = new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		
		Person gta = (Person) classPathXml.getBean("person");
		
		System.out.println(gta);
		
	}
}
