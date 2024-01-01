package com.springcore.removexml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RemoveMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext c1 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Client p1 = c1.getBean("friend",Client.class);
		
		
		System.out.println(p1);
		p1.Student();
		

	//	Server s1 = c1.getBean("system", Server.class);
		Server s2 = c1.getBean("maddy", Server.class);
		Server s3 = c1.getBean("caddy", Server.class);
		
	//	System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		c1.close();
	}
}
