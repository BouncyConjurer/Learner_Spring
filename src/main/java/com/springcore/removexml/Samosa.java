package com.springcore.removexml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Samosa {

	
	@Value("506")
	private int request;
	
	public void display() {
		
		System.out.println(this.request);
		System.out.println("Eating Samosa!!");
		
	}

}
