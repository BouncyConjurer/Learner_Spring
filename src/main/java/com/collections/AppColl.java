package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext collApplicationContext =new ClassPathXmlApplicationContext("com/collections/config.xml");
		Coll coll =(Coll) collApplicationContext.getBean("coll1");
		System.out.println(coll.getName());
		System.out.println(coll.getPhones());
		System.out.println(coll.getCourses());
		System.out.println(coll.getProp());
		System.out.println(coll);
		
	}

}
