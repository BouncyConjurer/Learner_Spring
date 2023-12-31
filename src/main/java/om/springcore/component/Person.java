package om.springcore.component;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("friend")
@Scope("prototype")
public class Person {
	
	@Value("Tree")
	private String s1;
	
	@Value("#{hash}")
	private HashMap<Integer, String> h1;

	public HashMap<Integer, String> getH1() {
		return h1;
	}

	public void setH1(HashMap<Integer, String> h1) {
		this.h1 = h1;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "Person [s1=" + s1 + "]";
	}
	
	
	
}
