package om.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompMain {
	
	public static void main(String[] args) {
		
		ApplicationContext classPath = new ClassPathXmlApplicationContext("om/springcore/component/compconfig.xml");
		Person p1 = classPath.getBean("friend",Person.class);
		
		System.out.println(p1);
		
		System.out.println(p1.getH1());
		System.out.println(p1.getH1().getClass().getName());
		System.out.println(p1.hashCode());
		
		Person p2 = classPath.getBean("friend",Person.class);
		System.out.println(p2.hashCode());
	}

}
