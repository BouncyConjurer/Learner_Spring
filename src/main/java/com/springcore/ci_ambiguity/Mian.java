package com.springcore.ci_ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
	
	public static void main(String[] args) {
		
		ApplicationContext classPathXml = new ClassPathXmlApplicationContext("com/springcore/ci_ambiguity/config.xml");
		
		Person p = (Person) classPathXml.getBean("person");
		
		System.out.println(p.toString());
		
	}

}
