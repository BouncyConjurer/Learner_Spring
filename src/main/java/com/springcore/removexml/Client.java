package com.springcore.removexml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("friend")
public class Client {
	
	@Autowired
	private Samosa samosa;
	
	
//	public River getRiver() {
//		return river;
//	}
//
//	public void setRiver(River river) {
//		this.river = river;
//	}
//
//
//	private River river;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public int getRest() {
		return rest;
	}

	public void setRest(int rest) {
		this.rest = rest;
	}

	@Value("#{25+24}")
	private int rest;
	
	@Override
	public String toString() {
		return "Client [rest=" + rest + "]";
	}

	public void Student() {
		
		
		this.samosa.display();
//		System.out.println(river.getJupiter());
		System.out.println("Student is reading book!!");
		
	}

}
