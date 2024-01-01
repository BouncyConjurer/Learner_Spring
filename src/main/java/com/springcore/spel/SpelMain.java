package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelMain {

	
	public static void main(String[] args) {
		
		ApplicationContext classPath = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Person p1 = classPath.getBean("person",Person.class);
		System.out.println(p1);
		
		
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp = temp.parseExpression("456+345");
		System.out.println(exp.getValue());
		
		
	}


}