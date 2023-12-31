package com.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jupiter {

	private int size;
	private String moon;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getMoon() {
		return moon;
	}
	public void setMoon(String moon) {
		this.moon = moon;
	}
	
	@Override
	public String toString() {
		return "Jupiter [size=" + size + ", moon=" + moon + "]";
	}
	
	
	/** This annotation is used to designate a method as a post-construction 
	 * callback method. The method annotated with @PostConstruct is invoked 
	 * after the bean has been instantiated and after all its dependencies have been injected.*/
	@PostConstruct
	public void create() {
		
		System.out.println("Creating Object..");
		
	}
	
	/** This annotation is used to designate a method as a pre-destruction
	 *  callback method. The method annotated with @PreDestroy is invoked
	 *   before the bean is destroyed, allowing for cleanup or resource release.*/
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("Destroying Object..");
		
	} 
	
}
